package gof.structural.proxy.demo1;

/**
 * In proxy pattern, a class represents functionality of another class. This
 * type of design pattern comes under structural pattern.
 * 
 * In proxy pattern, we create object having original object to interface its
 * functionality to outer world.
 * 
 * @author Anwesh
 * 
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		ProxyNote proxy = new ProxyNote("testing 123");
		proxy.readNote();
		proxy.readNote();
	}
}
