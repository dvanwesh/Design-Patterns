package gof.structural.adapterpattern.demo1;

public class Laptop implements Device{
	TouchAdapter touchAdapter;

	@Override
	public void type(String inputPeripheral, String letter) {
		if(inputPeripheral.equalsIgnoreCase("keyboard")){
			System.out.println("Typing letter "+letter);
		}
		if(inputPeripheral.equalsIgnoreCase("screen")){
			touchAdapter=new TouchAdapter(inputPeripheral);
			touchAdapter.type(inputPeripheral, letter);
		}
		
	}

	@Override
	public String name() {
		return "Laptop";
	}

}
