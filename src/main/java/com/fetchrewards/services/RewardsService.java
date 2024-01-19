package com.fetchrewards.services;

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
		return 0;
	}

	private int calculatePoints(Receipt receipt) {
		// TODO Auto-generated method stub
		int points = 0;
		points+= receipt.getRetailer().chars().filter(Character::isLetterOrDigit).count();
		
		return 0;
	}

	

}
