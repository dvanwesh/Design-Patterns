package gof.structural.flyweight.demo1;

import java.util.Random;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created
 * and to decrease memory footprint and increase performance. This type of
 * design pattern comes under structural pattern as this pattern provides ways
 * to decrease object count thus improving the object structure of application.
 * 
 * Flyweight pattern tries to reuse already existing similar kind objects by
 * storing them and creates new object when no matching object is found.
 * 
 * @author Anwesh
 * 
 */
public class FlyWeightPatternDemo {
	static final WheelChairType[] wcTypes = WheelChairType.values();
	static final WheelType[] wTypes = WheelType.values();
	static Random rnd = new Random();

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			WheelChair wc = WheelchairFactory.getSportsChair(getRandomType());
			wc.setWheels(getRandWheels());
			wc.push();
		}
	}

	private static WheelType getRandWheels() {
		return wTypes[rnd.nextInt(wTypes.length)];
	}

	private static WheelChairType getRandomType() {
		return wcTypes[rnd.nextInt(wcTypes.length)];
	}

}
