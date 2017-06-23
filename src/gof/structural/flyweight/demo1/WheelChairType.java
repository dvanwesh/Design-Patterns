package gof.structural.flyweight.demo1;

public enum WheelChairType {
	TENNIS("Tennis"), BASKETBALL("Basket Ball"), HOCKEY("Hockey"), RACING(
			"Racing"), LACROSE("Lacrose"), EVERYDAY("Everyday");
	String type;

	WheelChairType(String s) {
		type = s;
	}
}
