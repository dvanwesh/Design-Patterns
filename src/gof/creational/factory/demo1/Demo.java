package gof.creational.factory.demo1;

public class Demo {
public static void main(String[] args) {
	ShapeFactory shapeFactory=new ShapeFactory();
	Shape s1=shapeFactory.getShape("Circle");
	s1.draw();
}
}
