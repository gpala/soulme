package com.srai.inout.datamodels;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SCMInMapping {
	
	@Id
	private String intTable;
	private String fieldName;
	private String fieldDescription;
	private String fieldType;
	private Boolean isOptional;
	private String mapping;
	
	/**
	 * Like TODAY, LANG, DEFAULTs
	 */
	private Boolean inScope;
	private String constant;
	private String constantField;
	private String convertFunction;
	
	public SCMInMapping(){
		
	}

	public String getIntTable() {
		return intTable;
	}

	public void setIntTable(String intTable) {
		this.intTable = intTable;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldDescription() {
		return fieldDescription;
	}

	public void setFieldDescription(String fieldDescription) {
		this.fieldDescription = fieldDescription;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public Boolean getIsOptional() {
		return isOptional;
	}

	public void setIsOptional(Boolean isOptional) {
		this.isOptional = isOptional;
	}

	public String getMapping() {
		return mapping;
	}

	public void setMapping(String mapping) {
		this.mapping = mapping;
	}

	public Boolean getInScope() {
		return inScope;
	}

	public void setInScope(Boolean inScope) {
		this.inScope = inScope;
	}

	public String getConstant() {
		return constant;
	}

	public void setConstant(String constant) {
		this.constant = constant;
	}

	public String getConstantField() {
		return constantField;
	}

	public void setConstantField(String constantField) {
		this.constantField = constantField;
	}

	public String getConvertFunction() {
		return convertFunction;
	}

	public void setConvertFunction(String convertFunction) {
		this.convertFunction = convertFunction;
	}
	
	

}
