package com.srai.inout.datamodels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SCMInInterface {
	
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Id
	private Long id;
	
	private String inGroup;
	private String inTable;
	private String inTableComment;
	private String inProc;
	private String inLaunch;
	private String inPrefix;
	
	public SCMInInterface(){
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInGroup() {
		return inGroup;
	}
	public void setInGroup(String inGroup) {
		this.inGroup = inGroup;
	}
	public String getInTable() {
		return inTable;
	}
	public void setInTable(String inTable) {
		this.inTable = inTable;
	}	
	public String getInTableComment() {
		return inTableComment;
	}

	public void setInTableComment(String inTableComment) {
		this.inTableComment = inTableComment;
	}

	public String getInProc() {
		return inProc;
	}
	public void setInProc(String inProc) {
		this.inProc = inProc;
	}
	public String getInLaunch() {
		return inLaunch;
	}
	public void setInLaunch(String inLaunch) {
		this.inLaunch = inLaunch;
	}
	public String getInPrefix() {
		return inPrefix;
	}
	public void setInPrefix(String inPrefix) {
		this.inPrefix = inPrefix;
	}
	
}
