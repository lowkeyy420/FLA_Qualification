package observer;

import facade.Facade;
import facade.Helper;
import factory.CustomerFactory;
import model.Restaurant;
import model.human.Human;

public class CustomerGen implements Observer {

	private Restaurant res = Restaurant.getInstance("");

	@Override
	public void action() {
		if(Facade.CustomerChance()) {
			while(true) {
				String name = Helper.randomName();
				if(Human.isNameAvailable(res.getCustomerList(), name)) {
					CustomerFactory cf = new CustomerFactory();
					res.getCustomerList().add(cf.makeCustomer(name));
					break;
				}
				
			}
		}
		
	}
	
}
