package gof.behavioral.commandpattern.demo1;

public class ForeHandStroke implements Shot {
	private Player player;

	public ForeHandStroke(Player p) {
		player = p;
	}

	@Override
	public void play() {
		player.playForehand();
	}

}
