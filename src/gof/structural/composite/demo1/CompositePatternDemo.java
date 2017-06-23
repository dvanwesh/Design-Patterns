package gof.structural.composite.demo1;

/**
 * Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.

 This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.

 We are demonstrating use of composite pattern via following example in which we will show employees hierarchy of an organization.
 */
import gof.structural.composite.demo1.Employee.Dept;

public class CompositePatternDemo {
	public static void main(String[] args) {
		Employee ceo = new Employee("anvy", Dept.DIRECTOR);
		Employee m1 = new Employee("BS", Dept.DEVELOPER);
		Employee m2 = new Employee("JV", Dept.DIRECTOR);
		ceo.addEmployee(m1);
		ceo.addEmployee(m2);
		Employee d1 = new Employee("RTS", Dept.DEVELOPER);
		Employee q1 = new Employee("ANUD", Dept.TESTER);
		m2.addEmployee(d1);
		m2.addEmployee(q1);
		System.out.println(ceo);
		for (Employee e : ceo.getAllEmployees()) {
			System.out.println(e);
			for (Employee s : e.getAllEmployees()) {
				System.out.println("-->" + s);
			}
		}
	}
}
