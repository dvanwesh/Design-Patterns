package gof.structural.flyweight.demo1;

public enum WheelType {
	SPINERGY("spinergy"), COMPOSITE_MAG("Compasite mag"), SPOKED("Spoked");
	String type;

	WheelType(String s) {
		type = s;
	}
}
