package gof.structural.flyweight.demo1;

import java.util.HashMap;

public class WheelchairFactory {
	private static final HashMap<WheelChairType, WheelChair> sportsChairMap = new HashMap<WheelChairType, WheelChair>();
	private static int id=1;
	public static WheelChair getSportsChair(WheelChairType type) {
		WheelChair chair = sportsChairMap.get(type);
		if (chair == null) {
			chair = new SportsWheelChair(type);
			chair.setId(id);
			id++;
			sportsChairMap.put(type, chair);
			System.out.println("----------- Loaning " + type.type + " Wheelchair ----------");
		}
		return chair;
	}
}
