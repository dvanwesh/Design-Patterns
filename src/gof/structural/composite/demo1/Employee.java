package gof.structural.composite.demo1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private Dept department;

	enum Dept {
		DEVELOPER("Developer"), TESTER("QA"), DIRECTOR("Director");
		private String dep;

		Dept(String d) {
			dep = d;
		}
	}

	private List<Employee> subordinates;

	public Employee(String name, Dept d) {
		this.name = name;
		department = d;
		subordinates = new ArrayList<Employee>();

	}

	public void addEmployee(Employee e) {
		subordinates.add(e);
	}

	public void removeEmployee(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getAllEmployees() {
		return subordinates;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [name: " + name + " department: " + department.dep
				+ "]";
	}
}
