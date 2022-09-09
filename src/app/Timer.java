package app;

public abstract class Timer implements Runnable{

	private int delayTick = 200; // set tick delay per second for more accuracy
	private int tick;
	private Thread th;
	private boolean isRunning = false;
	private boolean isStopped = true;
	private boolean isPaused = false;
	
	public int getTick() {
		return tick;
	}
	
	public int getTickPS() {
		return 1000 / delayTick;
	}
	
	public boolean isRunning() {
		return isRunning;
	}

	public boolean isStopped() {
		return isStopped;
	}
	
	public boolean isPaused() {
		return isPaused;
	}
	
	public void start() {
		isRunning = true;
		isStopped = false;
		th.start();
	}
	
	public void pause() {
		isPaused = true;
		th.suspend();
	}
	
	public void stop() {
		isRunning = false;
		isStopped = true;
		th.stop();
	}
	
	public void resume() {
		isPaused = false;
		th.resume();
	}
	
	public Timer() {
		th = new Thread(this);
	}
	
	public abstract void runOnTick();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (isRunning && !isStopped) {
			try {
				Thread.sleep(delayTick);
			} catch (InterruptedException e) {
			}

			if(isPaused == false) {
				tick++;
				runOnTick();
			}
			
		}
		
	}

	
	
}
