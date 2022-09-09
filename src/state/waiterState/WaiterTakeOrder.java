package state.waiterState;

import model.human.Waiter;
import state.State;

public class WaiterTakeOrder implements State {
	public Waiter waiter;
	
	public WaiterTakeOrder(Waiter waiter) {
		super();
		this.waiter = waiter;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterWaitCook(waiter));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		
	}

}
