package state.waiterState;

import model.human.Waiter;
import state.State;

public class WaiterWaitCook implements State {
	public Waiter waiter;
	
	public WaiterWaitCook(Waiter waiter) {
		super();
		this.waiter = waiter;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterBringOrder(waiter));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		
	}
}
