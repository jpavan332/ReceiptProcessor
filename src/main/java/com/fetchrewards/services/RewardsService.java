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

	

}
