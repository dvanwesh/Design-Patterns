package gof.structural.decorator.demo1;

/**
 * Decorator pattern allows a user to add new functionality to an existing
 * object without altering its structure. This type of design pattern comes
 * under structural pattern as this pattern acts as a wrapper to existing class.
 * 
 * This pattern creates a decorator class which wraps the original class and
 * provides additional functionality keeping class methods signature intact.
 * 
 * @author Anwesh
 * 
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		WheelChair bulky = new EveryDayWheelChair("Bulky");
		WheelChair bulkyWSmartDrive = new SmartDriveWheelChairAdaptor(bulky);
		WheelChair tennisChair = new TennisWheelChair("Swift");
		bulkyWSmartDrive.push();
		tennisChair.push();
	}
}
