package com.peopleslabbd.webapps.sdmfsms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peopleslabbd.webapps.sdmfsms.model.entities.Customer;

/**
 * 
 * @author MAHMUD HASAN
 * @since v1
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
