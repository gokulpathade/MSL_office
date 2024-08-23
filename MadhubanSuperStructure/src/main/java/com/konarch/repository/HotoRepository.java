package com.konarch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konarch.model.Hoto;

@Repository
public interface HotoRepository extends JpaRepository<Hoto, Integer> {
	
}