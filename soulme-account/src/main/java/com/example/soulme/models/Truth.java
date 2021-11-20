package com.example.soulme.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data 
public class Truth {

	@Id
	@GeneratedValue
	private Long truthId;
	
	@NonNull private String truthUsername;
	private String truthPictureUrl;
	@NonNull private String truthDescription;
	
}
