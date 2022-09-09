package state.waiterState;

import model.human.Waiter;
import state.State;

public class WaiterBringOrder implements State {
	public Waiter waiter;
	
	public WaiterBringOrder(Waiter waiter) {
		super();
		this.waiter = waiter;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterServingFood(waiter));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		
	}
}
