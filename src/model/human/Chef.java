package model.human;

public class Chef extends Employee {
	private int skill;
	
	public Chef(String name) {
		super(name);
		this.skill = 1;
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
	

}
