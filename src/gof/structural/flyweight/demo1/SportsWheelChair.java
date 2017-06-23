package gof.structural.flyweight.demo1;

public class SportsWheelChair implements WheelChair {
	private WheelChairType wcType;
	private WheelType wheelType;
	private int id;

	public SportsWheelChair(WheelChairType wcT) {
		this.wcType = wcT;
	}

	public void setWheels(WheelType t) {
		wheelType = t;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void push() {
		System.out.println("Pushing " + wcType.type + " Wheelchair on "
				+ wheelType.type + " Wheels with ID "+id);
	}

}
