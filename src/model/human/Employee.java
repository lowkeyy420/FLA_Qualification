package model.human;

public abstract class Employee extends Human {
	
	private int speed;

	public Employee(String name) {
		super(name);
		this.speed = 1;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void addSpeed() {
		speed++;
	}
	
	

}
