package app;

import java.util.Scanner;

import facade.Facade;

public class Main {
	Facade fc = Facade.getInstance();
	
	
	public static void main(String[] args) {
		new Main();
	}
	
	
	public Main() {
		fc.menu();
	}
	
	

}
