package gof.behavioral.chainofresponsibility.demo1;

public class AlevelGame extends AbstractGame{
	public AlevelGame(String type){
		level=type;
	}

	@Override
	public void play(String player) {
		System.out.println("Playing at Level A "+player);
	}

}
