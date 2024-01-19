package com.fetchrewards.model;

public class Receipt {

	private String retailer;
	private String purchaseDate;
	private String purchaseTime;
	private Items items[];
	
	public Receipt(String retailer, String purchaseDate, String purchaseTime, Items[] items) {
		super();
		this.retailer = retailer;
		this.purchaseDate = purchaseDate;
		this.purchaseTime = purchaseTime;
		this.items = items;
	}
	public String getRetailer() {
		return retailer;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public String getPurchaseTime() {
		return purchaseTime;
	}
	public Items[] getItems() {
		return items;
	}
	public void setRetailer(String retailer) {
		this.retailer = retailer;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public void setPurchaseTime(String purchaseTime) {
		this.purchaseTime = purchaseTime;
	}
	public void setItems(Items[] items) {
		this.items = items;
	}
	
}
