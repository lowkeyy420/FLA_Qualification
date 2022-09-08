package facade;

import java.util.Scanner;

import app.game.Game;
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
	
	
}
