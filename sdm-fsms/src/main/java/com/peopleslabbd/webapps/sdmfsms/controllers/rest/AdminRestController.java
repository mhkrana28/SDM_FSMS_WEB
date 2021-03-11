package com.peopleslabbd.webapps.sdmfsms.controllers.rest;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peopleslabbd.webapps.sdmfsms.model.dtos.LoginDto;
import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;
import com.peopleslabbd.webapps.sdmfsms.services.AdminService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author MAHMUD HASAN
 * @since v1
 */
@Controller
@RequestMapping("/api/admin")
@Slf4j
public class AdminRestController {
	
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/validate", produces = "application/json")
	@ResponseBody
	private ResponseEntity<?> processAdminLogin(@RequestBody LoginDto loginDto) {
		log.info("Login Request Recieved from: "+request.getRemoteHost()+" at "+LocalDateTime.now());
		
		Admin admin = adminService.varifyLogginAttempt(loginDto);
		
		if (admin == null)
		return new ResponseEntity<String>("No valid user admin found !", HttpStatus.NON_AUTHORITATIVE_INFORMATION);
		
		return new ResponseEntity<Admin>(admin, HttpStatus.OK); 
	}
}
