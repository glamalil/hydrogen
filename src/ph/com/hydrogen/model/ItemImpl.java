package ph.com.hydrogen.model;
import java.sql.Date;

public class ItemImpl implements Item {

	private String itemName;
	private Date dateRegistered;
	private Category category;
	
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public Date getDateRegistered() {
		return dateRegistered;
	}
	
	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory (Category category) {
		this.category = category;
	}

	@Override
	public void showItem() {
		// TODO Auto-generated method stub
		System.out.println("Item Name: " + getItemName());
		System.out.println("Date Registered: " + dateRegistered);
		System.out.println("Category: " + getCategory().getCategoryName());
		
	}
	

}
