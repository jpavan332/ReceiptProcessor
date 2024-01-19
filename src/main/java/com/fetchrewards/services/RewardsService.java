package com.fetchrewards.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.fetchrewards.model.Receipt;


@Service
public class RewardsService {

	private Map<String,	Receipt> receiptMap = new HashMap<>();
	
	public String generateId(Receipt receipt) {
		// TODO Auto-generated method stub
		String receiptId = UUID.randomUUID().toString();
		
		receiptMap.put(receiptId, receipt);
		return receiptId;
	}

	public int getPoints(String id) {
		
		Receipt receipt = receiptMap.get(id);
		
		if(receipt == null)
			return 0;
		int points = calculatePoints(receipt);
		return points;
	}

	private int calculatePoints(Receipt receipt) {
		// TODO Auto-generated method stub
		int points = 0;
		
		//1. One point for every alphanumeric character in the retailer name.
		points+= receipt.getRetailer().chars().filter(Character::isLetterOrDigit).count();
		
		//2.  50 points if the total is a round dollar amount with no cents.
		double total = Double.parseDouble(receipt.getTotal());
		points+= (total == Math.ceil(total))?50:0;
		
		//3. 25 points if the total is a multiple of 0.25.
		points+= (total%0.25 == 0)?25:0;
		
		
		//4. 5 points for every two items on the receipt.
		int numOfItems = receipt.getItems().size();
		points+=(numOfItems/2)*5;

		
		/* 5.  If the trimmed length of the item description is a multiple of 3, 
		multiply the price by 0.2 and round up to the nearest integer. 
		The result is the number of points earned. */
		
		for(int i = 0;i<numOfItems;i++)
		{
			int lenOfDescription = receipt.getItems().get(i).getShortDescription().trim().length();
			if(lenOfDescription%3==0)
			{
				double price =Double.parseDouble(receipt.getItems().get(i).getPrice()) * 0.2;
				points+= Math.ceil(price);
			}
		}
		
		//6.  6 points if the day in the purchase date is odd.
		String date = receipt.getPurchaseDate();
		LocalDate purchaseDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
		int day = purchaseDate.getDayOfMonth();
		if(day%2!=0)
			points+=6;
		
		
		//7. 10 points if the time of purchase is after 2:00pm and before 4:00pm.
		
		String time = receipt.getPurchaseTime();
		
		LocalTime purchaseTime = LocalTime.parse(time,DateTimeFormatter.ofPattern("HH:mm"));
		if(purchaseTime.isAfter(LocalTime.of(14, 0)) && purchaseTime.isBefore(LocalTime.of(16, 0)))
		{
			points+=10;
		}
//		System.out.println("time points === "+points);
		return points;
	}

	

}
