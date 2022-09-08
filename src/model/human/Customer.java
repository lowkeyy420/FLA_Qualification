package model.human;

public class Customer {
	
	private String name;
	private int tolerance;
	
	public Customer(String name, int tolerance) {
		super();
		this.name = name;
		this.tolerance = tolerance;
	}

	public String getName() {
		return name;
	}

	public int getTolerance() {
		return tolerance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTolerance(int tolerance) {
		this.tolerance = tolerance;
	}
	
	public void deductTolerance(int num) {
		this.tolerance -= 1;
		if (this.tolerance <= 0) this.tolerance = 0;
	}
	
	

}
