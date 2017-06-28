package gof.behavioral.chainofresponsibility.demo1;

/**
 * As the name suggests, the chain of responsibility pattern creates a chain of
 * receiver objects for a request. This pattern decouples sender and receiver of
 * a request based on type of request. This pattern comes under behavioral
 * patterns.
 * 
 * In this pattern, normally each receiver contains reference to another
 * receiver. If one object cannot handle the request then it passes the same to
 * the next receiver and so on.
 * 
 * @author Anwesh
 * 
 */
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
