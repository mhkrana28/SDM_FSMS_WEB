package com.peopleslabbd.webapps.sdmfsms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peopleslabbd.webapps.sdmfsms.model.dtos.LoginDto;
import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;
import com.peopleslabbd.webapps.sdmfsms.repositories.AdminRepository;

/**
 * Implements App Admin related Activities 
 * 
 * @author MAHMUD HASAN
 * @since 2020-12-18
 */
@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepo;
	
	public Admin getAdminByUserName(String userName) {
		return adminRepo.findByUserName(userName);
	}

	public Admin varifyLogginAttempt(LoginDto loginDto) {
		Admin admin = adminRepo.findByUserNameAndPassword(loginDto.getUserName(), loginDto.getPassword());
		System.out.println(admin);
		return admin != null ? admin : null;
	}
}
