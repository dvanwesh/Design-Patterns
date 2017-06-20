package gof.creational.builder.demo1;

public abstract class CoolDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
