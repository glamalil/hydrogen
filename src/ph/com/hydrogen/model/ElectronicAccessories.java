package ph.com.hydrogen.model;

public class ElectronicAccessories extends ItemImpl{
	
	ElectronicAccessories(String desc) {
		super(desc);

	}
	

	@Override
	public void showItem() {
		// TODO Auto-generated method stub
		System.out.println("Electronic Accessories shown");
		super.showItem();
	}

	

}
