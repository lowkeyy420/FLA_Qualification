package model.human;

import state.State;
import state.chefState.ChefIdle;

public class Chef extends Employee {
	private int skill;
	private State state;
	
	public Chef(String name) {
		super(name);
		this.skill = 1;
		this.state = new ChefIdle(this);
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}
	
	public void addSkill() {
		this.skill++;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	

}
