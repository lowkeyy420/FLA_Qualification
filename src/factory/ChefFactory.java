package factory;

import model.human.Employee;
import model.human.chef.Chef;

public class ChefFactory implements EmployeeFactory {

	@Override
	public Employee makeEmployee(String name) {
		// TODO Auto-generated method stub
		return new Chef(name);
	}

}
