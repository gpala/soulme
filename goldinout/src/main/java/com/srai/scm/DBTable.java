package com.srai.scm;

public class DBTable {
	
	private String sTable;
	private String sComment;
	private String sColName;
	private String sColType;
	private String sColMandatory;
	private String sColDefault; 
	private String sColComment;

	public DBTable() {
		
	}

	public String getsTable() {
		return sTable;
	}

	public void setsTable(String sTable) {
		this.sTable = sTable;
	}

	public String getsComment() {
		return sComment;
	}

	public void setsComment(String sComment) {
		this.sComment = sComment;
	}

	public String getsColName() {
		return sColName;
	}

	public void setsColName(String sColName) {
		this.sColName = sColName;
	}

	public String getsColType() {
		return sColType;
	}

	public void setsColType(String sColType) {
		this.sColType = sColType;
	}

	public String getsColMandatory() {
		return sColMandatory;
	}

	public void setsColMandatory(String sColMandatory) {
		this.sColMandatory = sColMandatory;
	}

	public String getsColDefault() {
		return sColDefault;
	}

	public void setsColDefault(String sColDefault) {
		this.sColDefault = sColDefault;
	}

	public String getsColComment() {
		return sColComment;
	}

	public void setsColComment(String sColComment) {
		this.sColComment = sColComment;
	}
	
	
	
}
