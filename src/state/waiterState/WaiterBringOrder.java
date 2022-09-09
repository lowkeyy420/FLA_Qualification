package state.waiterState;

import model.human.Chef;
import model.human.Customer;
import model.human.Human;
import model.human.Waiter;
import state.State;

public class WaiterBringOrder implements State {
	public Waiter waiter;
	public Customer cus;
	public Chef chef;
	
	public WaiterBringOrder(Waiter waiter, Customer cus, Chef chef) {
		super();
		this.waiter = waiter;
		this.cus = cus;
		this.chef = chef;
	}

	@Override
	public void changeState() {
		waiter.setState(new WaiterServingFood(waiter, cus));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println(waiter.getName() +  " is bringing order from chef " + chef.getName());
		
	}
	@Override
	public void receiveS(Human human) {
		chef = (Chef) human;
		changeState();
	}

}
