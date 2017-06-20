package gof.creational.builder.demo1;

/**
 * Builder pattern builds a complex object using simple objects and using a step
 * by step approach. This type of design pattern comes under creational pattern
 * as this pattern provides one of the best ways to create an object.
 * 
 * A Builder class builds the final object step by step. This builder is
 * independent of other objects.
 * 
 * @author Anwesh
 * 
 */
public class MealBuilderDemo {
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		Meal chickenItems = builder.prepareMealA();
		chickenItems.showItems();
		System.out.println(chickenItems.getCost());
		Meal goatItems = builder.prepareMealB();
		goatItems.showItems();
		System.out.println(goatItems.getCost());
	}
}
