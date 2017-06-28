package gof.behavioral.commandpattern.demo1;

public class BackHandStroke implements Shot {
	Player player;

	public BackHandStroke(Player p) {
		player = p;
	}

	@Override
	public void play() {
		player.playBackhand();
	}

}
