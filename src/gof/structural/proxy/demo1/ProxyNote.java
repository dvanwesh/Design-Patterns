package gof.structural.proxy.demo1;

public class ProxyNote implements Notepad{
	private String txt;
	private RealNote note;
	public ProxyNote(String s){
		txt=s;
	}

	@Override
	public void readNote() {
		if(note==null){
			note=new RealNote(txt);
			System.out.println("-----Creating object-------");
		}
		note.readNote();
	}

}
