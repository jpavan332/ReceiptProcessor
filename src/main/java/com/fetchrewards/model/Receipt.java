package com.fetchrewards.model;

import java.util.List;

public class Receipt {

	private String retailer;
	private String purchaseDate;
	private String purchaseTime;
	private List<Items> items;
	private String total;
	
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public Receipt(String retailer, String purchaseDate, String purchaseTime, List<Items> items, String total) {
		super();
		this.retailer = retailer;
		this.purchaseDate = purchaseDate;
		this.purchaseTime = purchaseTime;
		this.items = items;
		this.total = total;
	}
	public Receipt() {
		super();
		// TODO Auto-generated constructor stub
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
	public List<Items> getItems() {
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
	public void setItems(List<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Receipt [retailer=" + retailer + ", purchaseDate=" + purchaseDate + ", purchaseTime=" + purchaseTime
				+ ", items=" + items + ", total=" + total + "]";
	}
	
}
