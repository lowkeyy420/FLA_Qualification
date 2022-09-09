package model.human;

import state.State;
import state.waiterState.WaiterIdle;

public class Waiter extends Employee {
	
	private State state;
	
	public Waiter(String name) {
		super(name);
		this.state = new WaiterIdle(this);
	}

	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}
	
	

}
