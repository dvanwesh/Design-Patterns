package gof.behavioral.chainofresponsibility.demo1;

public class OpenlevelGame extends AbstractGame{
	public OpenlevelGame(String type){
		level=type;
	}
	@Override
	public void play(String player) {
		System.out.println("Playing at Level Open "+player);
	}

}
