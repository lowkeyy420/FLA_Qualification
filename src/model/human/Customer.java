package model.human;

import state.State;
import state.customerState.CustomerOrder;

public class Customer extends Human {
	
	private int tolerance;
	private State state;

	public Customer(String name,int tolerance) {
		super(name);
		this.tolerance = tolerance;
		this.state = new CustomerOrder(this);
	}

	public int getTolerance() {
		return tolerance;
	}

	public void setTolerance(int tolerance) {
		this.tolerance = tolerance;
	}
	
	public void deductTolerance(int num) {
		this.tolerance -= 1;
		if (this.tolerance <= 0) this.tolerance = 0;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	

}
