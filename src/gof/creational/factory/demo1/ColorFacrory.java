package gof.creational.factory.demo1;

import gof.creational.abstractfactory.demo1.AbstractFactory;

public class ColorFacrory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		if(color==null) return null;
		if(color.equalsIgnoreCase("GREEN")) return new Green();
		if(color.equalsIgnoreCase("BLUE")) return new Blue();
		if(color.equalsIgnoreCase("YELLOW")) return new Yellow();
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
