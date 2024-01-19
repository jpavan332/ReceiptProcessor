package com.fetchrewards.model;

public class Items {
	private String shortDescription;
	private String price;
	
	
	public Items(String shortDescription, String price) {
		super();
		this.shortDescription = shortDescription;
		this.price = price;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public String getPrice() {
		return price;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
