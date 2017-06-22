package gof.creational.prototype.demo1;

public class Circle extends Shape{
	public Circle(){
		type="Circle";
	}
	@Override
	void draw() {
		System.out.println("inside Circle class: draw method");
	}

}
