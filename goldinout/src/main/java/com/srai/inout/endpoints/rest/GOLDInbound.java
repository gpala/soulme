package com.srai.inout.endpoints.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srai.inout.datamodels.SCMInInterface;
import com.srai.inout.datamodels.SCMInMapping;
import com.srai.inout.repositories.SCMInMappingRepository;
import com.srai.inout.repositories.SCMInterfaceRepository;

@RestController
public class GOLDInbound {

	@Autowired 
	private SCMInterfaceRepository scmInterfaceRepo;
	@Autowired 
	private SCMInMappingRepository scmInMappingRepo;
	
	@GetMapping("/api/interfaces")
	public List<SCMInInterface> getListOfInterfaces(){
		return scmInterfaceRepo.findAll();
	}
	
	@GetMapping("/api/interfaces/{interfId}")
	public SCMInInterface getListOfInterfaces(@PathParam("interfId") Integer id){
		return scmInterfaceRepo.getById(id);
	}
	
	
	@GetMapping("/api/intables/{table}")
	public List<SCMInMapping> getListOfInterfaces(@PathParam("table") String table){
		return scmInMappingRepo.findByIntTable(table);
	}
}
