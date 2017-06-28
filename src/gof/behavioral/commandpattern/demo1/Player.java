package gof.behavioral.commandpattern.demo1;

public class Player {
	String name;

	public Player(String n) {
		name = n;
	}

	public void playBackhand() {
		System.out.println("Stroke[ Name: " + name + ", type: BackHand]");
	}
	public void playForehand() {
		System.out.println("Stroke[ Name: " + name + ", type: ForeHand]");
	}
}
