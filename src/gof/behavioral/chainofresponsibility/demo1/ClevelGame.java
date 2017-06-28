package gof.behavioral.chainofresponsibility.demo1;

public class ClevelGame extends AbstractGame{
	public ClevelGame(String type){
		level=type;
	}
	@Override
	public void play(String player) {
		System.out.println("Playing at Level C "+player);
	}

}
