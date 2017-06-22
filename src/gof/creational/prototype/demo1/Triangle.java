package gof.creational.prototype.demo1;

public class Triangle extends Shape{
public Triangle() {
	type="Triangle";
}

@Override
void draw() {
	System.out.println("inside Triangle class: draw method");
}
}
