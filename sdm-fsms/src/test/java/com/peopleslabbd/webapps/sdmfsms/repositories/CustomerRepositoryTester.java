package com.peopleslabbd.webapps.sdmfsms.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;
import com.peopleslabbd.webapps.sdmfsms.model.entities.Customer;

@SpringBootTest
public class CustomerRepositoryTester {

	@Autowired private CustomerRepository cutomerRepo;
	
	@Test
	public void testSaveCustomer() {
		Customer customer = cutomerRepo.save(sampleCustomer());
		System.out.println("Save Customer: "+customer.toString());
		
		assertNotNull(customer);
	}
	
	private Customer sampleCustomer() {
		Admin sampleAdmin = new Admin().setId(1L);
		
		return new Customer()
				.setActive(true)
				.setAddedByAdmin(sampleAdmin)
				.setAddress("MuktarPur, Alikhola, Chittagong")
				.setFullName("Mr. Demo Hasan")
				.setLastModByAdmin(sampleAdmin)
				.setNId("XXX12345098")
				.setPhoneNumber("01917464598")
				.setPhotoUrl("")
				.setVipCode(0);
	}
}
