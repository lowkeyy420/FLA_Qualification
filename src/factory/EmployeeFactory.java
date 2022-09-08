package factory;

import model.human.Employee;

public interface EmployeeFactory {

	public Employee makeEmployee(String name);

}
