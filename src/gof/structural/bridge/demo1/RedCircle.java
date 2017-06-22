package gof.structural.bridge.demo1;

public class RedCircle implements DrawApi{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Circle: [color: red, Radius: "+radius+" X "+x+" Y "+y+"]");
	}

}
