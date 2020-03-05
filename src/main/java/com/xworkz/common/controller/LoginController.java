package com.xworkz.common.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.common.dto.LoginControllerDTO;
import com.xworkz.common.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private LoginService loginService ;
	
	private static Logger logger = Logger.getLogger(LoginController.class);
	
	public LoginController() {
		logger.info("created \t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/login.do")
	public String onSignIn(LoginControllerDTO loginControllerDTO, ModelMap map) {
		try {
			logger.info("invoked onSignIn");
			boolean check=this.loginService.validateLoginDetails(loginControllerDTO);
			
			
			if(check) {
				ModelMap success=map.addAttribute("successmessage", loginControllerDTO.getEmail());
				return "last";
			}else {
				ModelMap failure=map.addAttribute("failureMessage","Signin unsuccessfull");
				logger.info("the email is not correct, enter the correct email");
				return "signin";
				}
		}catch(Exception e) {
			e.printStackTrace();
			logger.info("signin:"+e.getMessage());
		}
		return "signin";
	}
}






