package gof.structural.facade.demo1;

public class Detroit implements City {
	@Override
	public void bestThingsGoing() {
		System.out.println("American Cars with Rock music");
	}

	@Override
	public String toString() {
		return getClass().getName();
	}

}
