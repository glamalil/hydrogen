package ph.com.hydrogen.model;

public class ItemImpl implements Item {

	private String type;
	
	public String desc;
	
	
	ItemImpl (String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getType() {
		return type;

	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public void showItem() { // TODO Auto-generated method stub
		System.out.println("Type: " + getType());
		System.out.println("Description: " + getDesc());
		
		
	}

}
