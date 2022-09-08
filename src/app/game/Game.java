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
	
	
	
	
}
