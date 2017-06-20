package gof.creational.builder.demo1;

public class MealBuilder {
	public Meal prepareMealA() {
		Meal m = new Meal();
		m.addItem(new ChickenBiryani());
		m.addItem(new Coke());
		return m;
	}

	public Meal prepareMealB() {
		Meal m = new Meal();
		m.addItem(new GoatBiryani());
		m.addItem(new ThumsUp());
		return m;
	}
}
