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
			input = sc.nextInt(); sc.nextLine();
			switch (input) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				System.exit(0);
				break;
			}
			
		}
		
	}

}
