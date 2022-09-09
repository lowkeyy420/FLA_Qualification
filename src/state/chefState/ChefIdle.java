package state.chefState;

import model.human.Chef;
import model.human.Human;
import state.State;

public class ChefIdle implements State {
	private Chef chef;
	
	public ChefIdle(Chef chef) {
		this.chef = chef; 
	}
	
	@Override
	public void changeState() {
		chef.setState(new ChefCook(chef));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println(chef.getName() +  " is idling");
	}

	
	@Override
	public void receiveS(Human human) {
		changeState();
	}

}
