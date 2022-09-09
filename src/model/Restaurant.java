package model;

public class Restaurant {
	private String name;
	private Integer money;
	private Integer defaultMoney = 1300, defaultScore = 0, defaultChair = 4;
	private Integer score;
	private Integer chair;
	
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

	public Integer getChair() {
		return chair;
	}

	public void setChair(Integer chair) {
		this.chair = chair;
	}
	
	
	
	
	
	
	
}
