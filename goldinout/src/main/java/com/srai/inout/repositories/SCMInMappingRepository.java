package com.srai.inout.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srai.inout.datamodels.SCMInMapping;

@Repository
public interface SCMInMappingRepository extends JpaRepository<SCMInMapping, String>{

	public List<SCMInMapping> findByIntTable(String intTable);
	
}
