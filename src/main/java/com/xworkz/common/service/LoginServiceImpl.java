package com.xworkz.common.service;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.common.dao.CommonControllerDAO;
import com.xworkz.common.dto.LoginControllerDTO;
import com.xworkz.common.entity.CommonControllerEntity;

@Service
public class LoginServiceImpl implements  LoginService{

	@Autowired
	private CommonControllerDAO commonControllerDAO;
	

	public LoginServiceImpl() {
		logger.info("created \t"+this.getClass().getSimpleName());
		
	}
	
	private static Logger logger = Logger.getLogger(LoginServiceImpl.class);
	public boolean validateLoginDetails(LoginControllerDTO loginControllerDTO) {
		boolean valid = false;
		try {
			logger.info("dataSave invoked " + loginControllerDTO);

			if (Objects.nonNull(loginControllerDTO)) {

				CommonControllerEntity com=new CommonControllerEntity();
				BeanUtils.copyProperties(loginControllerDTO, com);
				CommonControllerEntity com1=commonControllerDAO.fetchByEmailandPassword(loginControllerDTO.getEmail(), loginControllerDTO.getPassword());

				if (com1 !=null) {
					logger.info("entity is ready \t " + com);
					commonControllerDAO.fetchByEmailandPassword(loginControllerDTO.getEmail(), loginControllerDTO.getPassword());
					logger.info("Email is exist");
					return true;
				}
				} else {
					logger.info("entity as saved email already exits");
					return false;
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valid;

	}
	
	}



