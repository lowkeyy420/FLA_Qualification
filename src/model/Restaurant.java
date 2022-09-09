package model;

import java.util.Vector;

import model.human.Human;

public class Restaurant {
	private String name;
	private Integer money;
	private Integer defaultMoney = 1300, defaultScore = 0, defaultChair = 4;
	private Integer score;
	private Integer chair;
	private Integer availableChair = 0;
	
	private Vector<Human> customerList = new Vector<Human>();
	private Vector<Human> chefList = new Vector<Human>();
	private Vector<Human> waiterList = new Vector<Human>();
		
	private static Restaurant instance;
	public static Restaurant getInstance(String name ) {
		if(instance == null) instance = new Restaurant(name);
		return instance;
	}
	
	private Restaurant(String name) {
		this.name = name;
		this.money = defaultMoney;
		this.score = defaultScore;
		this.chair = defaultChair;
		
	}

	public String getName() {
		return name;
	}

	public Integer getMoney() {
		return money;
	}
	
	public Integer getScore() {
		return score;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getChair() {
		return chair;
	}

	public void setChair(Integer chair) {
		this.chair = chair;
	}

	public Integer getAvailableChair() {
		return availableChair;
	}

	public void setAvailableChair(Integer availableChair) {
		this.availableChair = availableChair;
	}

	public Vector<Human> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Vector<Human> customerList) {
		this.customerList = customerList;
	}
	
	public void addCustomerToList(Human h) {
		this.customerList.add(h);
	}

	public Vector<Human> getChefList() {
		return chefList;
	}

	public Vector<Human> getWaiterList() {
		return waiterList;
	}

	public void setChefList(Vector<Human> chefList) {
		this.chefList = chefList;
	}

	public void setWaiterList(Vector<Human> waiterList) {
		this.waiterList = waiterList;
	}
	
	public void addChefToList(Human h) {
		this.chefList.add(h);
	}
	
	public void addWaiterToList(Human h) {
		this.waiterList.add(h);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
