package mediator;

import java.util.Vector;

import model.human.Human;

public class Mediator implements MediatorInterface {

	private static Mediator instance;
	
	public static Mediator getInstance() {
		if(instance == null) instance = new Mediator();
		return instance;
	}
	
	public Mediator() {
	}

	Vector<Human> mediatorList = new Vector<Human>();
	
	@Override
	public void add(Human human) {
		mediatorList.add(human);
	}

	@Override
	public void remove(Human human) {
		// TODO Auto-generated method stub
		mediatorList.remove(human);
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		mediatorList.clear();
	}

	@Override
	public void ping(Human sender, Human receiver) {
		// TODO Auto-generated method stub
		if(mediatorList.contains(sender) && mediatorList.contains(receiver)) {
			receiver.getState().receiveS(sender);
		}	
		
	}
	
	

}
