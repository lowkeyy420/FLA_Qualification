package facade;

import java.util.Scanner;

public class Helper {
	
	public static void cls() {
		for(int i = 0 ; i < 33 ; i++) {
			System.out.println("");
		}
	}
	
	public static void showSplashBeginning() {
		cls();
		System.out.println("  __             __                     ");
		System.out.println("|/  |           /  |           /        ");
		System.out.println("|   | ___      (___| ___  ___ (___  ___ ");
		System.out.println("|   )|   )     |\\   |___)|___ |    |   )");
		System.out.println("|__/ |__/|     | \\  |__   __/ |__  |__/");
		System.out.printf("\n\n\n\nPress Enter to Continue...");
		Scanner sc = new Scanner(System.in);
		String enter = sc.nextLine();
	}
	
	public static void showMainMenu() {
		cls();
		System.out.println("Main Menu");
		System.out.println("1. Play New Restaurant");
		System.out.println("2. High Score");
		System.out.println("3. Exit");
		System.out.print("Input [1..3] : ");
	}
	
}
