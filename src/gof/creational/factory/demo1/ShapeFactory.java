package gof.creational.factory.demo1;

import gof.creational.abstractfactory.demo1.AbstractFactory;

public class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shapeType){
		if(shapeType==null) return null;
		if(shapeType.equalsIgnoreCase("CIRCLE"))return new Circle();
		if(shapeType.equalsIgnoreCase("SQUARE")) return new Square();
		if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		return null;
	}
	public Color getColor(String color){
		return null;
	}
}
