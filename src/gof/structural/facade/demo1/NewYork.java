package gof.structural.facade.demo1;

public class NewYork implements City {

	@Override
	public void bestThingsGoing() {
		System.out.println("Mega City with multi culturalism");
	}

	@Override
	public String toString() {
		return getClass().getName();
	}

}
