package app.game;

import java.util.Scanner;

import app.Timer;
import facade.Facade;
import facade.Helper;
import model.Restaurant;

public class Game extends Timer {
	private int state = 0; // 0 stop, 1 playing, 2 pause
	Scanner sc = new Scanner(System.in);
	Facade fc = Facade.getInstance();
	
	private static Game instance;
	public static Game getinstance() {
		if(instance == null) instance = new Game();
		return instance;
	}
	
	private Game() {
		
	}
	
	public void play() {
		Helper.cls();
		newRestaurant();
		super.start();
		while (isRunning()) {
			if(isPaused()) {
				fc.pauseMenu();
				showStatus();
				sc.nextLine();
				resume();
			}
			else {
				sc.nextLine();
				pause();
			}
		}
	}
	
	
	private void newRestaurant() {
		System.out.print("Input Restaurant Name : ");
		String restaurantName = sc.nextLine();
		Restaurant r = Restaurant.getInstance(restaurantName);
	}

	@Override
	public void runOnTick() {
		if(getTick() % (getTickPS()) == 0) reload();
		
	}
	
	private void showStatus() {
		System.out.println("Is running = " + isRunning());
		System.out.println("Is paused = " + isPaused());
		System.out.println("Is stopped = " + isStopped());
		System.out.println("Enter to start");
		System.out.println();
	}
	
	private void reload() {
//		Helper.cls();
		System.out.println("Is running = " + isRunning());
		System.out.println("Is paused = " + isPaused());
		System.out.println("Is stopped = " + isStopped());
		System.out.println("Enter to pause");
		System.out.println();
	}
	
	
	
	
}
