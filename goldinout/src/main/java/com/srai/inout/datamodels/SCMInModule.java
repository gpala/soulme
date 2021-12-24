package com.srai.inout.datamodels;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
public class SCMInModule {
	@Id
	private String scmModule;
	private String scmDescription;
	private Integer scmModuleSeq;	
	
	@OneToOne(cascade = CascadeType.ALL)
	private SCMInInterface scmInterface;	
	
	public SCMInModule() {
		
	}
	
	public Integer getScmModuleSeq() {
		return scmModuleSeq;
	}



	public void setScmModuleSeq(Integer scmModuleSeq) {
		this.scmModuleSeq = scmModuleSeq;
	}



	public SCMInInterface getScmInterface() {
		return scmInterface;
	}



	public void setScmInterface(SCMInInterface scmInterface) {
		this.scmInterface = scmInterface;
	}



	public String getScmModule() {
		return scmModule;
	}

	public void setScmModule(String scmModule) {
		this.scmModule = scmModule;
	}

	public String getScmDescription() {
		return scmDescription;
	}

	public void setScmDescription(String scmDescription) {
		this.scmDescription = scmDescription;
	}

	
	
}
