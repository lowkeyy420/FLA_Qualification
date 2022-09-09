package state.chefState;

import model.human.Chef;
import model.human.Human;
import state.State;

public class ChefCook implements State {

	private Chef chef;
	
	public ChefCook(Chef chef) {
		this.chef = chef; 
	}
	
	@Override
	public void changeState() {
		chef.setState(new ChefDone(chef));
		
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println(chef.getName() +  " is cooking");
		
	}

	@Override
	public void receiveS(Human human) {
		changeState();
	}

}
