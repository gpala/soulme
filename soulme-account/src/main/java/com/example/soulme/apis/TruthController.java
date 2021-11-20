package com.example.soulme.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.soulme.models.Truth;
import com.example.soulme.repositories.TruthRepository;

@RestController
@RequestMapping("/api/truth/v1")
public class TruthController {
	
	@Autowired
	private TruthRepository truthService;
	
	@GetMapping
	public List<Truth> getAllTruths(){
		
		return truthService.findAll();	
	}
	
	@PostMapping
	public void addTruth( @RequestBody Truth newTruth) {
		truthService.save(newTruth);
	}
	
	@PutMapping
	public void updateTruth( @RequestBody Truth newTruth) {
		
	
		truthService.save(newTruth);
	}

}
