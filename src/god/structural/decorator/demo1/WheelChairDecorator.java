package god.structural.decorator.demo1;

public abstract class WheelChairDecorator implements WheelChair {
	protected WheelChair decoratedWheelchair;

	public WheelChairDecorator(WheelChair wc) {
		this.decoratedWheelchair = wc;
	}

	public void push() {
		decoratedWheelchair.push();
	}
}
