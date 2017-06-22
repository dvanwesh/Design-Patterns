package gof.structural.bridge.demo1;

public class Circle extends Shape{
private int x,y,radius;
	protected Circle(DrawApi d,int x,int y,int radius) {
		super(d);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}

	@Override
	public void draw() {
		drawApi.drawCircle(radius, x, y);
	}

}
