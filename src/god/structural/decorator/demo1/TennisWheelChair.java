package god.structural.decorator.demo1;

public class TennisWheelChair implements WheelChair {
	private String name;

	public TennisWheelChair(String name) {
		setName(name);
	}

	@Override
	public void push() {
		System.out.println("Pushing Tennis Wheelchair");
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public void setName(String n) {
		name = n;
	}

	@Override
	public String getName() {
		return name;
	}
	
}
