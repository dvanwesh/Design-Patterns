package gof.structural.adapterpattern.demo1;

public class TouchAdapter implements Device{
	AdvancedDevice touchDevice;
	
	public TouchAdapter(String inputPeripheral) {
		if(inputPeripheral.equalsIgnoreCase("screen")){
			touchDevice=new Tablet();
		}
	}

	@Override
	public void type(String inputPeripheral, String letter) {
		if(inputPeripheral.equalsIgnoreCase("screen")){
			touchDevice.touch(letter);
		}
		
	}

	@Override
	public String name() {
		return null;
	}

}
