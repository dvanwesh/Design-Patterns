package gof.behavioral.chainofresponsibility.demo1;

public class ChainOfResponsibilityDemo {
	public static AbstractGame getChainofResponsibility() {
		AbstractGame alevel = new AlevelGame(AbstractGame.ALEVEL);
		AbstractGame blevel = new BlevelGame(AbstractGame.BLEVEL);
		AbstractGame clevel = new ClevelGame(AbstractGame.CLEVEL);
		AbstractGame open = new OpenlevelGame(AbstractGame.OPENLEVEL);
		clevel.setNextGame(blevel);
		blevel.setNextGame(alevel);
		alevel.setNextGame(open);
		return clevel;
	}

	public static void main(String[] args) {
		AbstractGame game = getChainofResponsibility();
		game.playGame(AbstractGame.CLEVEL, "Anvy");
		game.playGame(AbstractGame.OPENLEVEL, "Matt");
	}
}
