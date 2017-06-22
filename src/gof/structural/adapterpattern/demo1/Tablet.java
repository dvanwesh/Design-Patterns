package gof.structural.adapterpattern.demo1;

public class Tablet implements AdvancedDevice{

	@Override
	public void touch(String letter) {
		System.out.println("Touch on "+letter);
	}

	@Override
	public String name() {
		return "Tablet";
	}

}
