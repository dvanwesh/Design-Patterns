package gof.structural.bridge.demo1;

public abstract class Shape {
protected DrawApi drawApi;
protected Shape(DrawApi d){
	drawApi=d;
}
public abstract void draw();
}
