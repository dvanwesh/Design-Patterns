package gof.creational.abstractfactory.demo1;

import gof.creational.factory.demo1.Color;
import gof.creational.factory.demo1.Shape;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
		AbstractFactory colorFactory=FactoryProducer.getFactory("color");
		Shape s1=shapeFactory.getShape("square");
		s1.draw();
		Color c1=colorFactory.getColor("green");
		c1.fill();
	}
}