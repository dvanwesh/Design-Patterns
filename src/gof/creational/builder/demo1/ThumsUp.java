package gof.creational.builder.demo1;

public class ThumsUp extends CoolDrink{

	@Override
	public String name() {
		return "Thums up";
	}

	@Override
	public float price() {
		return 2.49f;
	}

}
