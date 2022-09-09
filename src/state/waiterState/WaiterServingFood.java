package state.waiterState;

import model.human.Waiter;
import state.State;

public class WaiterServingFood implements State{
	public Waiter waiter;
	
	public WaiterServingFood(Waiter waiter) {
		super();
		this.waiter = waiter;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterIdle(waiter));
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		
	}
}
