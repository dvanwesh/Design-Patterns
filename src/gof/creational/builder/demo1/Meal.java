package gof.creational.builder.demo1;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.println("Item: " + item.name() + " ,Cost: "
					+ item.price() + " ,Packing: " + item.packing().pack());
		}
	}
}
