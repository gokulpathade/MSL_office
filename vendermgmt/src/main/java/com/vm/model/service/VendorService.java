package com.vm.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vm.exceptionhandling.ResourceNotFoundException;
import com.vm.model.Vendor;
import com.vm.model.repository.EmailRepository;
import com.vm.model.repository.VendorRepository;

import jakarta.transaction.Transactional;

@Service
public class VendorService {

	
	

	  @Autowired
	    private VendorRepository vendorRepository;
	    
	    @Autowired
	    private EmailRepository emailRepository;

	    public List<Vendor> getAllVendors() {
	        return vendorRepository.findAll();
	    }

	    public Vendor getVendorById(Long id) {
	        return vendorRepository.findById(id).orElse(null);
	    }

	    @Transactional
	    public Vendor createVendor(Vendor vendor) {
	        return vendorRepository.save(vendor);
	    }

	    @Transactional
	    public Vendor updateVendor(Long id, Vendor updatedVendor) {
	        Vendor existingVendor = vendorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Vendor not found"));
	        existingVendor.setName(updatedVendor.getName());
	        existingVendor.setEmail(updatedVendor.getEmail());
	        existingVendor.setUpi(updatedVendor.getUpi());
	        return vendorRepository.save(existingVendor);
	    }

	    @Transactional
	    public void deleteVendor(Long id) {
	        emailRepository.deleteByVendorId(id); // First delete related emails
	        vendorRepository.deleteById(id);      // Then delete the vendor
	    }   
	    
}
