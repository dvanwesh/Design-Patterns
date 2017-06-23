package gof.structural.proxy.demo1;

public class RealNote implements Notepad{
	private String text;
	public RealNote(String s){
		text=s;
	}
	@Override
	public void readNote() {
		System.out.println("reading: "+text);
	}

}
