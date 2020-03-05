package com.xworkz.common.dto;

import org.apache.log4j.Logger;

import com.xworkz.common.controller.LoginController;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginControllerDTO {
	private String email;
	private String password; 
	private static Logger logger = Logger.getLogger(LoginControllerDTO.class);
	
	
	public void LoginControllerDTO() {
		logger.info("Created \t"+this.getClass().getName());
	}

	@Override
	public String toString() {
		return "LoginControllerDTO [email=" + email + ", password=" + password + "]";
	}

	
	
	
}
