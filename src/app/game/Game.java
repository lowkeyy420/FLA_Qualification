package app.game;

public class Game {
	private int state = 0; // 0 stop, 1 playing, 2 pause
	
	private static Game instance;
	public static Game getinstance() {
		if(instance == null) instance = new Game();
		return instance;
	}
	
	private Game() {
		
	}
	
	public void play() {
		this.state = 1;

		Thread a = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 20;
				while(i > 10 && state == 1) {
					System.out.println(i);
					i--;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(i == 11) stopp();
				}
			}
			
			
			public void stopp() {
				state = 0;
			}
		});
			
//		a.start();

	}
	
	
	
	
}
