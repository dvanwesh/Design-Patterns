package gof.creational.singleton.demo1;

public class SingleObject {
	private static SingleObject instance=new SingleObject();
private SingleObject(){};
public static SingleObject getInstance(){
	return instance;
}
public void showMsg(){
	System.out.println("single instance");
}
}
