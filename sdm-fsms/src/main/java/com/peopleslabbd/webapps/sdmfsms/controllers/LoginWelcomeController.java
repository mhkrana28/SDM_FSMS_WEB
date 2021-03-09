package com.peopleslabbd.webapps.sdmfsms.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.peopleslabbd.webapps.sdmfsms.commons.constants.Key;
import com.peopleslabbd.webapps.sdmfsms.commons.constants.Txt;
import com.peopleslabbd.webapps.sdmfsms.commons.enums.View;
import com.peopleslabbd.webapps.sdmfsms.model.dtos.LoginDto;
import com.peopleslabbd.webapps.sdmfsms.model.entities.Admin;
import com.peopleslabbd.webapps.sdmfsms.services.AdminService;

/**
 * Controller for processing login
 * 
 * @author MAHMUD HASAN
 * @since 2020-01-01
 */
@Controller
public class LoginWelcomeController {

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
		model.addAttribute("loginDto", new LoginDto());
		model.addAttribute(Key.PAGE_TITLE, Txt.PAGE_LOGIN_TITLE);
		model.addAttribute(Key.LOGIN_NOTICE, Txt.EMPTY);
        return View.LOGIN_PAGE.get();
    }
	
	@PostMapping(value = "/login")
	public String processLogin(ModelMap uiModel, @ModelAttribute("loginDto") LoginDto loginDto, BindingResult bindingResult) {
		HttpSession session = request.getSession();
		
		Admin admin = adminService.varifyLogginAttempt(loginDto);
		if (admin == null) {
			uiModel.addAttribute(Key.PAGE_TITLE, Txt.PAGE_LOGIN_TITLE);
			uiModel.addAttribute(Key.LOGIN_NOTICE, Txt.LOGIN_ERROR);
			
	        return View.LOGIN_PAGE.get();
		}
		
		session.setAttribute(Key.SESSION_USER, admin);
		
		return "redirect:/dashboard";
	}
	
	
	@GetMapping(value = "/dashboard")
    public String dashboard(ModelMap uiModel) {
		HttpSession session = request.getSession();
        Admin validAdmin = (Admin) session.getAttribute(Key.SESSION_USER);
        
        if (validAdmin == null) return "redirect:/";
        
        uiModel.addAttribute(Key.PAGE_TITLE, Txt.PAGE_DASHBOARD_TITLE);
        uiModel.addAttribute(Key.MAIN_CONTENT, View.DASHBOARD_HOME.get());
        
        return View.DASHBOARD_PARENT.get();
    }
	
}
