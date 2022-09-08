package app;

import java.util.Scanner;

import facade.FileHandler;
import facade.Helper;
import model.highscore.HighScore;
import model.highscore.HighScoreList;

public class Main {
	Scanner sc = new Scanner(System.in);
	Helper hp = Helper.getInstance();
	
	
	public static void main(String[] args) {
		new Main();
	}
	
	
	public Main() {
		hp.showSplashBeginning();
		sc.nextLine();
		
		int input = 0 ;
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
				showHighScore();
				HighScoreList list = HighScoreList.getInstance();
				list.addHighScore(new HighScore("Bobi", 80));
				list.addHighScore(new HighScore("Joojo", 30));
				list.addHighScore(new HighScore("Feysen", 160));
				list.addHighScore(new HighScore("MIkha", 200));
				FileHandler handler = FileHandler.getInstance();
				handler.writeHighScore(list.getHighscoreList());
				sc.nextLine();
			}
			if (input == 3) System.exit(0);
		}
		
	}
	
	
	private void startGame() {
		System.out.println("strt");
	}
	
	private void showHighScore() {
		System.out.println("score");		
	}
	

}
