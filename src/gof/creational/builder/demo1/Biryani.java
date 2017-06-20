package gof.creational.builder.demo1;

public abstract class Biryani implements Item {
	@Override
	public Packing packing() {
		return new BoxPack();
	}
	@Override
	public abstract float price();
}
