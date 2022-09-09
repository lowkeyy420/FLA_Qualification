package facade;

import java.util.Random;

public class Helper {
	
	
	private static Helper instance;
	public static Helper getInstance() {
		if(instance == null) instance = new Helper();
		return instance;
	}
	
	private Helper() {
		
	}

	
	public static void cls() {
		for(int i = 0 ; i < 33 ; i++) {
			System.out.println("");
		}
	}
	
	public void showSplashBeginning() {
		cls();
		System.out.println("  __             __                     ");
		System.out.println("|/  |           /  |           /        ");
		System.out.println("|   | ___      (___| ___  ___ (___  ___ ");
		System.out.println("|   )|   )     |\\   |___)|___ |    |   )");
		System.out.println("|__/ |__/|     | \\  |__   __/ |__  |__/");
		System.out.printf("\n\n\n\nPress Enter to Continue...");
		
	}
	
	public void showMainMenu() {
		cls();
		System.out.println("Main Menu");
		System.out.println("1. Play New Restaurant");
		System.out.println("2. High Score");
		System.out.println("3. Exit");
		System.out.print("Input [1..3] : ");
	}
	
	public static int randomTolerance() {
		int max = 150;
		int min = 100;
		int result = (int) Math.floor(Math.random()*(max-min+1)+min);
		
		return result;
	}
	
	public static String randomName() {
		Random r = new Random();
		
		Character first = (char) (r.nextInt(26)+ 'A');
		Character second = (char) (r.nextInt(26)+ 'A');
		String res = first.toString() + second.toString();
//		System.out.println(res);
		return res;
	}
	
}
