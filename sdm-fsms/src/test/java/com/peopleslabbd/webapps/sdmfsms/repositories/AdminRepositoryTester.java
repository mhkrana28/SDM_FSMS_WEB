package com.peopleslabbd.webapps.sdmfsms.repositories;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.peopleslabbd.webapps.sdmfsms.commons.enums.Role;
import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;

@SpringBootTest
public class AdminRepositoryTester {
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Test
	public void testFindAll() {
		List<Admin> list = adminRepo.findAll();
		System.out.println("Total Admin Count: "+list.size());
		
		assertNotNull(list);
	}
	
	@Test
	public void testSaveAdmin() {
		Admin admin = adminRepo.save(getSampleAdmin());
		System.out.println("Saved object: "+admin.toString());
		
		assertNotNull(admin);
	}
	
	private Admin getSampleAdmin() {
		return new Admin()
				.setFullName("Abdul Goni")
				.setUserName("admin")
				.setPhoneNumber("01917464603")
				.setPassword("admin123")
				.setRoleCode(Role.SUPER.getCode())
				.setActive(true);
	}
}
