package gof.creational.builder.demo1;

public class ChickenBiryani extends Biryani{

	@Override
	public String name() {
		return "Chicken Biryani";
	}

	@Override
	public float price() {
		return 11.99f;
	}

}
