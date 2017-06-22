package gof.creational.prototype.demo1;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<Integer, Shape> shapeMap = new Hashtable<Integer, Shape>();

	public static Shape getShape(int id) {
		Shape cachedShape = shapeMap.get(id);
		return (Shape) cachedShape.clone();
	}

	public static void loadCache() {
		Circle circle1 = new Circle();
		circle1.setShapeId(1);
		shapeMap.put(circle1.getShapeId(), circle1);
		Triangle tr = new Triangle();
		tr.setShapeId(2);
		shapeMap.put(tr.getShapeId(), tr);
		Rhombus rm = new Rhombus();
		rm.setShapeId(3);
		shapeMap.put(rm.getShapeId(), rm);
	}
}
