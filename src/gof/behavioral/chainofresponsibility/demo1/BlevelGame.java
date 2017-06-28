package gof.behavioral.chainofresponsibility.demo1;

public class BlevelGame extends AbstractGame{
	public BlevelGame(String type){
		level=type;
	}
	@Override
	public void play(String player) {
		System.out.println("Playing at Level B "+player);
	}

}
