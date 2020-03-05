package com.xworkz.common.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.common.dto.CommonControllerDTO;
import com.xworkz.common.service.CommonControllerService;

@Controller
@RequestMapping("/")
public class CommonController {
	@Autowired
	private CommonControllerService  commonControllerService;
	
	private static Logger logger = Logger.getLogger(CommonController.class);
	
	

	public CommonController() {
		logger.info("Created \t " + this.getClass().getSimpleName());
	}

	@RequestMapping("/Submit.do")
	public String onSave(CommonControllerDTO awardDTO,ModelMap map) {
		try {
			logger.info("invoked onSubmit");
			boolean check = this. commonControllerService.validateAndSave(awardDTO);
			if (check) {
			
				map.addAttribute("Sucess meassage", "Data saved");
			} else {
				map.addAttribute("Failure message", "Data not saved");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Signup";

	}

}







