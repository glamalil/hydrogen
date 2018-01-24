package ph.com.hydrogen.model;

import java.util.List;
import ph.com.hydrogen.model.Item;

public class SellerImpl implements Seller {

	private String name;
	private String location;
	private String phone;
	private int greviews;
	private int breviews;
	private List<Item> items;
	// private Item item;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getGReviews() {
		return greviews;
	}

	public void setGReviews(int greviews) {
		this.greviews = greviews;
	}

	public int getBReviews() {
		return breviews;
	}

	public void setBReviews(int breviews) {
		this.breviews = breviews;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	/*
	 * public Item getItem() { return item; } public void setItem(Item item) {
	 * this.item=item;
	 * }
	 */

	@Override
	public void showSeller() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + getName());
		System.out.println("Location: " + getLocation());
		System.out.println("Phone: " + getPhone());
		System.out.println("Good Reviews: " + getGReviews());
		System.out.println("Bad Reviews: " + getBReviews());
		System.out.println("ITEMS");
		for(Item item: this.getItems()) {
			item.showItem();
		}
	}
}
