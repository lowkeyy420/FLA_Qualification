package app;

import java.util.Scanner;

import facade.Helper;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		new Main();
	}
	
	
	public Main() {
		Helper.showSplashBeginning();
		
		int input = 0 ;
		while(true) {
			Helper.showMainMenu();
			try {
				input = sc.nextInt(); 
			} catch (Exception e) {
			} sc.nextLine();
			if (input == 1) {
				startGame();
			}
			if (input == 2) {
				showHighScore();
			}
			if (input == 3) System.exit(0);
		}
		
	}
	
	
	private void startGame() {
		
	}
	
	private void showHighScore() {
		
	}
	

}
