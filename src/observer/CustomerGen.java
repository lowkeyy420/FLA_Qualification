package observer;

import facade.Facade;
import facade.Helper;
import factory.CustomerFactory;
import mediator.Mediator;
import model.Restaurant;
import model.human.Customer;
import model.human.Human;

public class CustomerGen implements Observer {

	private Restaurant res = Restaurant.getInstance("");
	private Mediator md = Mediator.getInstance();

	@Override
	public void action() {
		if(Facade.CustomerChance()) {
			while(true) {
				String name = Helper.randomName();
				if(Human.isNameAvailable(res.getCustomerList(), name)) {
					CustomerFactory cf = new CustomerFactory();
					Customer cus = cf.makeCustomer(name);
					res.getCustomerList().add(cus);
					md.add(cus);
					res.setAvailableChair(res.getAvailableChair() + 1);
					break;
				}
				
			}
		}
		
	}
	
}
