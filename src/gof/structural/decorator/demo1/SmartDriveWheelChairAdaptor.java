package gof.structural.decorator.demo1;

public class SmartDriveWheelChairAdaptor extends WheelChairDecorator {

	public SmartDriveWheelChairAdaptor(WheelChair wc) {
		super(wc);
	}

	public void push() {
		decoratedWheelchair.push();
		setSmartDrive(decoratedWheelchair);
	}

	private void setSmartDrive(WheelChair decoratedWheelchair) {
		System.out.println("---> Smart Drive enabled for " + decoratedWheelchair);
	}

	@Override
	public void setName(String n) {
		decoratedWheelchair.setName(n);
	}

	@Override
	public String getName() {
		return decoratedWheelchair.getName();
	}
}
