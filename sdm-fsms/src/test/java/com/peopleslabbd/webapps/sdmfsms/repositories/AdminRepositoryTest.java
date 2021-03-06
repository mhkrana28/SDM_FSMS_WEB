package com.peopleslabbd.webapps.sdmfsms.repositories;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;

@SpringBootTest
public class AdminRepositoryTest {
	
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
		return new Admin().setName("Abdul Goni")
				   .setPhoneNumber("01916453423")
				   .setPassword("xyz123")
				   .setRoleCode(Short.MAX_VALUE)
				   .setActive(true);
	}
}
