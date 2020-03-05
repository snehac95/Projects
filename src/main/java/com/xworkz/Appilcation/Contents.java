package com.xworkz.Appilcation;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class Contents {
	private static Logger logger = Logger.getLogger(Contents.class);
	
	
	@RequestMapping("/message.do")
	public String getMessage() {
		logger.info("inside getMessage()....of"+this.getClass().getSimpleName());
		logger.trace("trace message --> inside getMessage()....");
		logger.debug("debug message --> inside getMessage()....");
		logger.warn("warn message --> inside getMessage()....");
		logger.error("error message --> inside getMessage()....");
		logger.fatal("fatal message --> inside getMessage()....");
		
		try {
			Integer.parseInt("2314mk32");
			
		} catch(NumberFormatException e) {
			logger.error("-->Exception occured");
		}
		System.out.println("inside getMessage()....");
		return "/message.jsp";
	}
}



