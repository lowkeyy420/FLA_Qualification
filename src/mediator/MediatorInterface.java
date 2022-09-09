package mediator;

import model.human.Human;

public interface MediatorInterface {
	public void add(Human human);
	public void remove(Human human);
	public void removeAll();
	public void ping(Human sender, Human receiver);
}
