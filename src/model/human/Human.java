package model.human;

import java.util.Vector;

public abstract class Human {
	private String name;
	
	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static boolean isNameAvailable(Vector<Human> list, String toSearch) {
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if (h.getName().equals(toSearch)) return false;
		}		
		return true;
	}
	
}
