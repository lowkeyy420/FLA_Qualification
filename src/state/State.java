package state;

import model.human.Human;

public interface State {
	public void changeState();
	public void describe();
	public void receiveS(Human human);
}
