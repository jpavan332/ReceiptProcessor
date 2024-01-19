package com.fetchrewards.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fetchrewards.model.Receipt;
import com.fetchrewards.services.RewardsService;

@RestController
@RequestMapping("/receipts")
public class RewardsController {
	
	@Autowired
	RewardsService rewardsService;
	
	@PostMapping("/process")
	public ResponseEntity<?> generateId(@RequestBody Receipt receipt)
	{
		String receiptId = rewardsService.generateId(receipt);
		return ResponseEntity.ok(Map.of("id",receiptId));
	}
	
	@GetMapping("/{id}/points")
	public ResponseEntity<?> getPoints(@PathVariable String id)
	{
		int points = rewardsService.getPoints(id);
		System.out.println("points == "+points);
		return ResponseEntity.ok(Map.of("points",points));
	}


}
