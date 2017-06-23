package gof.structural.filtercriteria.demo1;

public class Racquet {
	private String name;
	private String brand;
	private String color;
	private RacquetType type;

	public static enum RacquetType {
		TENNIS("Tennis"), SQUASH("Squash"), BADMINTON("Shuttle");
		private String gameType;
		RacquetType(String s){
			gameType=s;
		}
	}

	public Racquet(String name, String brand, String color, RacquetType t) {
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.type = t;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public RacquetType getType() {
		return type;
	}
@Override
public String toString() {
	return name+" Brand: "+brand+" Color: "+color+" Type: "+type.gameType;
}
}
