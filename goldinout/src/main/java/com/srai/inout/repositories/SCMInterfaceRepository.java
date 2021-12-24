package com.srai.inout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srai.inout.datamodels.SCMInInterface;

@Repository
public interface SCMInterfaceRepository extends JpaRepository<SCMInInterface, Integer>{

}
