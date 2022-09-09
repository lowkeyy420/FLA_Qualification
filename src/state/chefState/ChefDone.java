package state.chefState;

import model.human.Chef;
import state.State;

public class ChefDone implements State{
	private Chef chef;
	
	public ChefDone(Chef chef) {
		this.chef = chef; 
	}
	
	@Override
	public void changeState() {
		chef.setState(new ChefIdle(chef));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		
	}

	
	
}
