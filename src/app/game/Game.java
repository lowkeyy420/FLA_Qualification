package app.game;

import java.util.Scanner;

import app.Timer;
import facade.Facade;
import facade.Helper;
import factory.ChefFactory;
import factory.CustomerFactory;
import factory.EmployeeFactory;
import factory.WaiterFactory;
import mediator.Mediator;
import model.Restaurant;
import model.human.Chef;
import model.human.Customer;
import model.human.Human;
import model.human.Waiter;
import observer.CustomerGen;
import observer.CustomerGenFetcher;

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
		fetch.addObsv(new CustomerGen());
	}
	
	CustomerGenFetcher fetch = CustomerGenFetcher.getInstance();
	
	public void play() {
		Helper.cls();
		newRestaurant();
		initAll();
		
		t = new Timer() {
			
			@Override
			public void runOnTick() {
				if(getTick() % getTickPS() == 0) {
					reload(t);
					fetch.run();
					time++;
					Restaurant r = Restaurant.getInstance("");
					for (Human h : r.getCustomerList()) {
						System.out.println(h.getName());
					}
				}
			}
		};
		
		t.start();
		t.pause();
		String input = "";
		while (t.isRunning()) {
			if(t.isPaused()) {
				fc.pauseMenu();
//				showStatus(t);
				System.out.println("Press Enter to Continue..");
				System.out.println("Press 'q' to exit..");
				input = sc.nextLine();
				if(input.equals("q")) t.stop();
				else t.resume();
			}
			else {
				sc.nextLine();
				t.pause();
			}
		}
		
		
//		showAll();
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
		r.setName(restaurantName);
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
		Helper.cls();
//		System.out.println("Is running = " + t.isRunning());
//		System.out.println("Is paused = " + t.isPaused());
//		System.out.println("Is stopped = " + t.isStopped());
		Restaurant r = Restaurant.getInstance("");
		
		System.out.println(time);
		if(!r.getCustomerList().isEmpty()) {
			for (Human a : r.getCustomerList()) {
				a.getState().describe();
			}
//			r.getCustomerList().get(Facade.randomCustomer()).getState().describe();			
		}
		System.out.println("Press Enter to pause");
		System.out.println();
	}
	
	public void initAll() {
		Restaurant r = Restaurant.getInstance("");
		Mediator md = Mediator.getInstance();
		r.getChefList().clear();
		r.getWaiterList().clear();
		r.setMoney(1300);
		r.setScore(0);
		r.setChair(4);
		
		EmployeeFactory factory = new ChefFactory();
		Chef chef1 = (Chef) factory.makeEmployee(Helper.randomName());
		Chef chef2 = (Chef) factory.makeEmployee(Helper.randomName());
		
		factory = new WaiterFactory();
		Waiter waiter1 = (Waiter) factory.makeEmployee(Helper.randomName() + "-chan");
		Waiter waiter2 = (Waiter) factory.makeEmployee(Helper.randomName() + "-chan");
		
		r.getChefList().add(chef1);
		r.getChefList().add(chef2);
		r.getWaiterList().add(waiter1);
		r.getWaiterList().add(waiter2);
		
		md.add(chef1);
		md.add(chef1);
		md.add(waiter1);
		md.add(waiter2);
		
	}

	@Override
	public void runOnTick() {
	}	
	
	
	public void showAll() {
		Mediator md = Mediator.getInstance();
		EmployeeFactory fctry = new ChefFactory();
		Chef chef1 = (Chef) fctry.makeEmployee("Chef Juna");
		Chef chef2 = (Chef) fctry.makeEmployee("Chef joji");
		
		EmployeeFactory fctry2 = new WaiterFactory();
		Waiter w1 = (Waiter) fctry2.makeEmployee("Marvin");
		Waiter w2 = (Waiter) fctry2.makeEmployee("Luki");
		
		CustomerFactory cf = new CustomerFactory();
		Customer c1 = cf.makeCustomer("Bob");
		Customer c2 = cf.makeCustomer("Stuart");
		
		md.add(chef1);
		md.add(chef2);
		md.add(w1);
		md.add(w2);
		md.add(c1);
		md.add(c2);
		
		c1.getState().describe();
		c1.getState().changeState();
		c1.getState().describe();
		w1.getState().describe();
		sc.nextLine();
		
		md.ping(c1, w1);
		c1.getState().describe();
		w1.getState().describe();
		sc.nextLine();
		
		w1.getState().changeState();
		w1.getState().describe();
		sc.nextLine();
		
		md.ping(chef1, w1);
		w1.getState().describe();
		sc.nextLine();
		
		w1.getState().changeState();
		w1.getState().describe();
		
		sc.nextLine();
		
		c1.getState().changeState();
		c1.getState().describe();
		
		sc.nextLine();
	}
	
	
}
