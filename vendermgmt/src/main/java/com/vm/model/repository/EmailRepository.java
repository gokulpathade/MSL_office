package com.vm.model.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vm.model.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
	
	List<Email> findByVendorId(Long vendorId);
    void deleteByVendorId(Long vendorId);
}
