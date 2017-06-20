package gof.creational.abstractfactory.demo1;

import gof.creational.factory.demo1.Color;
import gof.creational.factory.demo1.Shape;

public abstract class AbstractFactory {
public abstract Color getColor(String color);
public abstract Shape getShape(String shape);
}
