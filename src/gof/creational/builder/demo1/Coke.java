package gof.creational.builder.demo1;

public class Coke extends CoolDrink{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 1.99f;
	}

}
