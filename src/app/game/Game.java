package app.game;

import java.util.Scanner;

import app.Timer;
import facade.Facade;
import facade.Helper;
import model.Restaurant;

public class Game extends Timer {
	Scanner sc = new Scanner(System.in);
	Facade fc = Facade.getInstance();
	int time = 0;
	Timer t;
	
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
			
		t = new Timer() {
			
			@Override
			public void runOnTick() {
				if(getTick() % getTickPS() == 0) {
					reload(t);
					time++;
				}
			}
		};
		
		t.start();
		t.pause();
		String input = "";
		while (t.isRunning()) {
			if(t.isPaused()) {
				fc.pauseMenu();
				showStatus(t);
				input = sc.nextLine();
				if(input.equals("q")) t.stop();
				else t.resume();
			}
			else {
				sc.nextLine();
				t.pause();
			}
		}
	}
	
	
	private void newRestaurant() {
		String restaurantName;
		while(true) {
			System.out.print("Input Restaurant Name : ");
			restaurantName = sc.nextLine();	
			if(restaurantName.length() >= 3 && restaurantName.length() <= 15) break;
		}
		System.out.println();
		Restaurant r = Restaurant.getInstance(restaurantName);
	}

	
	private void showStatus(Timer t) {
		System.out.println("Is running = " + t.isRunning());
		System.out.println("Is paused = " + t.isPaused());
		System.out.println("Is stopped = " + t.isStopped());
		System.out.println("Enter to start");
		System.out.println("Type 'q' to quit");
		System.out.println(time);
		System.out.println();
	}
	
	private void reload(Timer t) {
//		Helper.cls();
		System.out.println("Is running = " + t.isRunning());
		System.out.println("Is paused = " + t.isPaused());
		System.out.println("Is stopped = " + t.isStopped());
		System.out.println("Enter to pause");
		System.out.println(time);
		System.out.println();
	}

	@Override
	public void runOnTick() {
	}	
	
	
}
