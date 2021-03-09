package com.peopleslabbd.webapps.sdmfsms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	public Admin findByUserName(String userName);
	public Admin findByUserNameAndPassword(String userName, String password);
}
