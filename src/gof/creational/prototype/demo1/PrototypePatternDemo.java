package gof.creational.prototype.demo1;

/**
 * Prototype Pattern says that cloning of an existing object instead of creating
 * new one and can also be customized as per the requirement.
 * 
 * This pattern should be followed, if the cost of creating a new object is
 * expensive and resource intensive.
 * 
 * Advantage of Prototype Pattern
 * 
 * The main advantages of prototype pattern are as follows:
 * 
 * It reduces the need of sub-classing. It hides complexities of creating
 * objects. The clients can get new objects without knowing which type of object
 * it will be. It lets you add or remove objects at runtime. Usage of Prototype
 * Pattern
 * 
 * When the classes are instantiated at runtime. When the cost of creating an
 * object is expensive or complicated. When you want to keep the number of
 * classes in an application minimum. When the client application needs to be
 * unaware of object creation and representation.
 * 
 * @author vdatla
 * 
 */
public class PrototypePatternDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape clShape1 = (Shape) ShapeCache.getShape(1);
		System.out.println("Shape: " + clShape1.getType());
		Shape clShape2 = (Shape) ShapeCache.getShape(2);
		System.out.println("Shape: " + clShape2.getType());
		Shape clShape3 = (Shape) ShapeCache.getShape(3);
		System.out.println("Shape: " + clShape3.getType());
	}
}
