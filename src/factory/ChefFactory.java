package factory;

import model.human.Chef;
import model.human.Employee;

public class ChefFactory implements EmployeeFactory {

	@Override
	public Employee makeEmployee(String name) {
		// TODO Auto-generated method stub
		return new Chef(name);
	}

}
