package model;

public class Restaurant {
	private String name;
	private Integer money;
	private Integer defaultMoney = 1300;
	
	private static Restaurant instance;
	public static Restaurant getInstance() {
		if(instance == null) instance = new Restaurant();
		return instance;
	}
	
	private Restaurant() {
		this.money = defaultMoney;
	}

	public String getName() {
		return name;
	}

	public Integer getMoney() {
		return money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}
	
	
	
	
	
}
