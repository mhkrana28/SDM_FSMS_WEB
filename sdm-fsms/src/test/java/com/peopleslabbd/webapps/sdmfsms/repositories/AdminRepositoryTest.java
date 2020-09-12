package com.peopleslabbd.webapps.sdmfsms.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;

@SpringBootTest
public class AdminRepositoryTest {
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Test
	public void testSaveAdmin() {
		Admin admin = adminRepo.save(getSampleAdmin());
		System.out.println("Saved object: "+admin.toString());
		
		assertNotNull(admin);
	}
	
	private Admin getSampleAdmin() {
		return new Admin().setName("Abdul Goni")
				   .setPhoneNumber("01916453423")
				   .setPassword("xyz123")
				   .setNidNumber("1990768765")
				   .setRoleCode(Short.MAX_VALUE)
				   .setActive(true);
	}
}
