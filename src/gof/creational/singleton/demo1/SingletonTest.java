package gof.creational.singleton.demo1;

public class SingletonTest {
public static void main(String[] args) {
	SingleObject obj=SingleObject.getInstance();
	obj.showMsg();
}
}
