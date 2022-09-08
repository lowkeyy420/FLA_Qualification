package model.human;

public abstract class Employee {
	
	private String name;
	private int speed;

	public int getSpeed() {
		return speed;
	}
	
	public void addSpeed() {
		speed++;
	}

	public Employee(String name) {
		this.name = name;
		this.speed = 1;
	}
	
	
	

}
