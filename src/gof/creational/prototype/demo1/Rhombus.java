package gof.creational.prototype.demo1;

public class Rhombus extends Shape {
	public Rhombus() {
		type = "Rhombus";
	}

	@Override
	void draw() {
		System.out.println("inside Rhombus class: draw method");
	}

}
