package ph.com.hydrogen.model;

public class ElectronicDevice extends ItemImpl {
	
	ElectronicDevice(String desc) {
		super(desc);

	}

	@Override
	public void showItem() {
		System.out.println("Electronic Device Shown");
		super.showItem();
		
	}
	
}
