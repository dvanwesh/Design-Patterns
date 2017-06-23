package gof.structural.facade.demo1;

public class Charlotte implements City {

	@Override
	public void bestThingsGoing() {
		System.out.println("NASCAR Racing with greenary");
	}

	@Override
	public String toString() {
		return getClass().getName();
	}

}
