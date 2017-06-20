package gof.creational.abstractfactory.demo1;

import gof.creational.factory.demo1.ColorFacrory;
import gof.creational.factory.demo1.ShapeFactory;

public class FactoryProducer {
public static AbstractFactory getFactory(String choice){
	if(choice==null) return null;
	if(choice.equalsIgnoreCase("SHAPE")) return new ShapeFactory();
	if(choice.equalsIgnoreCase("COLOR")) return new ColorFacrory();
	return null;
}
}
