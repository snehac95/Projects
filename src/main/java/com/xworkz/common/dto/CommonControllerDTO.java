package com.xworkz.common.dto;

import org.apache.log4j.Logger;

import com.xworkz.common.controller.LoginController;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonControllerDTO {
	private String username;
	private String email;
	private long mobile;
	private String  password;
	private String confirmpassword;
	
	private static Logger logger = Logger.getLogger(CommonControllerDTO.class);
	
	public void CommonControllerDTO() {
		logger.info("Created \t"+this.getClass().getName());
	}

	@Override
	public String toString() {
		return "CommonControllerDTO [username=" + username + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", confirmpassword=" + confirmpassword + "]";
	}
	

}
