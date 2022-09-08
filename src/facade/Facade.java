package facade;

import java.util.Scanner;

public class Facade {
	private static Facade instance;
	public static Facade getInstance() {
		if(instance == null) instance = new Facade();
		return instance;
	}
	
	private Facade() {
		
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		Helper hp = Helper.getInstance();
		
		hp.showSplashBeginning();
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
				
				//test view
//				HighScoreList list = HighScoreList.getInstance();
//				FileHandler handler = FileHandler.getInstance();
//				
//				try {
//					list.setHighscoreList(handler.readHighScore());
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				for (HighScore a : list.getHighscoreList()) {
//					System.out.println("name: " + a.getName() + "\tscore : " + a.getScore());
//				}
//				
//				sc.nextLine();
			}
			if (input == 3) System.exit(0);
		}
	}
	
	
}
