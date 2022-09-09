package observer;

import java.util.Vector;

public class CustomerGenFetcher implements Fetcher {
	
	private static CustomerGenFetcher instance;
	public static CustomerGenFetcher getInstance() {
		if (instance == null) instance = new CustomerGenFetcher();
		return instance;
	}

	private CustomerGenFetcher() {
		
	}
	
	private Vector<Observer> ob = new Vector<Observer>();
	
	@Override
	public void addObsv(Observer obs) {
		// TODO Auto-generated method stub
		ob.add(obs);
	}

	@Override
	public void removeObsv(Observer obs) {
		// TODO Auto-generated method stub
		ob.remove(obs);
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		ob.clear();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (Observer observer : ob) {
			observer.action();
		}
	}

}
