package gof.behavioral.chainofresponsibility.demo1;

public abstract class AbstractGame {
	public static final String ALEVEL = "A";
	public static final String BLEVEL = "B";
	public static final String CLEVEL = "C";
	public static final String OPENLEVEL = "@OPEN";
	protected AbstractGame nextGame;
	public String level;

	public void setNextGame(AbstractGame game) {
		nextGame = game;
	}

	public void playGame(String type, String player) {
		if (level.charAt(0) <= type.charAt(0))
			play(player);
		if (nextGame != null)
			nextGame.playGame(type, player);
	}

	public abstract void play(String player);
}
