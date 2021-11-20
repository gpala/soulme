package com.example.soulme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.soulme.models.Truth;

@Repository
public interface TruthRepository extends JpaRepository<Truth, Long>{

}
