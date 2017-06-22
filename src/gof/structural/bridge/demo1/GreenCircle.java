package gof.structural.bridge.demo1;

public class GreenCircle implements DrawApi{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Circle: [color: green, Radius: "+radius+" X "+x+" Y "+y+"]");
	}

}
