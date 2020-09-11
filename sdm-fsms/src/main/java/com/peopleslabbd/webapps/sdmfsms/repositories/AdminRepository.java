package com.peopleslabbd.webapps.sdmfsms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
