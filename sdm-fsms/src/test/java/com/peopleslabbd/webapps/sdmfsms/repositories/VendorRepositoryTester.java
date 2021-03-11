package com.peopleslabbd.webapps.sdmfsms.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;
import com.peopleslabbd.webapps.sdmfsms.model.entities.Vendor;

@SpringBootTest
public class VendorRepositoryTester {

	@Autowired
	private AdminRepository adminRepo;
	@Autowired
	private VendorRepository vendorRepo;
	
	@Test
	public void testSaveVendor() {
		Vendor vendor = createSampleVendor();
		vendor = vendorRepo.save(vendor);
		
		System.out.println("Saved: "+vendor.toString());
		assertNotNull(vendor);
	}	
	
	private Vendor createSampleVendor() {
		Admin sampleAdmin = adminRepo.findById(1L).orElse(null);
		
		return new Vendor()
				.setActive(true)
				.setAddedByAdmin(sampleAdmin)
				.setAddress("Gulshan Circle 1, Dhaka")
				.setEmail("contact@shaktiltd.com")
				.setFriendly(true)
				.setFullName("Shakti Enterprise Ltd")
				.setLastModByAdmin(sampleAdmin)
				.setPhoneNumber("01711XXXXXX")
				.setWebsiteAddress("www.shaktiltd.com")
				.setId(1L);
	}
}
