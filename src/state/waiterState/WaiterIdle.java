package state.waiterState;

import model.human.Waiter;
import state.State;

public class WaiterIdle implements State {
	public Waiter waiter;
	
	
	
	public WaiterIdle(Waiter waiter) {
		super();
		this.waiter = waiter;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterTakeOrder(waiter));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		
	}

}
