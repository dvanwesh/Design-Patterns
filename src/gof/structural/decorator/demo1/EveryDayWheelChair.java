package gof.structural.decorator.demo1;

public class EveryDayWheelChair implements WheelChair {
	private String name;

	public EveryDayWheelChair(String n) {
		setName(n);
	}

	@Override
	public void push() {
		System.out.println("Pushing Everyday WheelChair");
	}

	@Override
	public void setName(String n) {
		name = n;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
