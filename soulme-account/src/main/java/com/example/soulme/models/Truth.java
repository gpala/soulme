package com.example.soulme.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NonNull;

@Entity
public class Truth {

	@Id
	@GeneratedValue
	private Long truthId;
	
	@NonNull 
	private String truthUsername;
	private String truthPictureUrl;
	
	@NonNull private String truthDescription;
	
	public Truth() {
		
	}

	public Long getTruthId() {
		return truthId;
	}

	public void setTruthId(Long truthId) {
		this.truthId = truthId;
	}

	public String getTruthUsername() {
		return truthUsername;
	}

	public void setTruthUsername(String truthUsername) {
		this.truthUsername = truthUsername;
	}

	public String getTruthPictureUrl() {
		return truthPictureUrl;
	}

	public void setTruthPictureUrl(String truthPictureUrl) {
		this.truthPictureUrl = truthPictureUrl;
	}

	public String getTruthDescription() {
		return truthDescription;
	}

	public void setTruthDescription(String truthDescription) {
		this.truthDescription = truthDescription;
	}
	
	
}
