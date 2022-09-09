package facade;

import java.util.Scanner;

import app.game.Game;
import model.Restaurant;
import model.highscore.HighScore;
import model.highscore.HighScoreList;

public class Facade {
	private static Facade instance;
	public static Facade getInstance() {
		if(instance == null) instance = new Facade();
		return instance;
	}
	
	private Facade() {
		
	}
	
	private void startGame() {
		Game g = Game.getinstance();
		g.play();
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		Helper hp = Helper.getInstance();
		
		hp.showSplashBeginning();
		HighScoreList.initScores();
		sc.nextLine();
		
		int input = 0;
		while(true) {
			input = 0;
			hp.showMainMenu();
			try {
				input = sc.nextInt(); 
			} catch (Exception e) {
				
			} 
			sc.nextLine();
			if (input == 1) {
				startGame();
				
			}
			if (input == 2) {
			
				//test add
//				HighScoreList list = HighScoreList.getInstance();
//				list.addHighScore(new HighScore("Bobi", 80));
//				list.addHighScore(new HighScore("Joojo", 30));
//				list.addHighScore(new HighScore("Feysen", 160));
//				list.addHighScore(new HighScore("MIkha", 200));
//				FileHandler handler = FileHandler.getInstance();
//				handler.writeHighScore(list.getHighscoreList());
//				sc.nextLine();
				
				HighScoreList.initScores();
				HighScoreList.printAllScores();
				sc.nextLine();

			}
			if (input == 3) System.exit(0);
		}
	}
	
	public void pauseMenu() {
		Helper.cls();
		Restaurant r = Restaurant.getInstance("");
		System.out.println("-----PAUSE MENU-----");
		System.out.println("Status");
		System.out.println("Money: " + r.getMoney());
		System.out.println("Score: " + r.getScore());
		System.out.println("Size : " + r.getChair());
		System.out.println();
		
	}
	
	public static boolean CustomerChance() {
		Restaurant r = Restaurant.getInstance("");
		if(r.getAvailableChair() == r.getChair()) return false;
		
		int result = (int) Math.floor(Math.random()*(100-0+1)+0);
		if(result > 74) return true;
		
		return false;
	}
	
	public static int randomCustomer() {
		Restaurant r = Restaurant.getInstance("");
		int random = (int) Math.floor(Math.random()*(r.getCustomerList().size()));
		return random;
	}
	
	public static int randomChef() {
		Restaurant r = Restaurant.getInstance("");
		int random = (int) Math.floor(Math.random()*(r.getChefList().size()));
		return random;
	}
	
	public static int randomWaiter() {
		Restaurant r = Restaurant.getInstance("");
		int random = (int) Math.floor(Math.random()*(r.getWaiterList().size()));
		return random;
	}
	
	
}
