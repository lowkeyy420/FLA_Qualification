package factory;

import model.human.Employee;
import model.human.Waiter;

public class WaiterFactory implements EmployeeFactory{

	@Override
	public Employee makeEmployee(String name) {
		return new Waiter(name);
	}

}
