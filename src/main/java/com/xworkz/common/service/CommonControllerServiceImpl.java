package com.xworkz.common.service;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.common.dao.CommonControllerDAO;
import com.xworkz.common.dto.CommonControllerDTO;
import com.xworkz.common.entity.CommonControllerEntity;
@Service
public class CommonControllerServiceImpl implements  CommonControllerService {

	@Autowired
	private CommonControllerDAO commonControllerDAO;

	private static Logger logger = Logger.getLogger(CommonControllerServiceImpl.class);

	public CommonControllerServiceImpl() {
		logger.info("Created \t " + this.getClass().getSimpleName());
	}

	public boolean validateAndSave(CommonControllerDTO commonControllerDTO) {
		boolean valid = false;
		try {
			logger.info("validateAndSave invoked " + commonControllerDTO);

			if (Objects.nonNull(commonControllerDTO)) {
				logger.info("starting validation for " + commonControllerDTO);
				String username = commonControllerDTO.getUsername();
				if (username != null && !username.isEmpty() && username.length() >= 5) {
					logger.info("username is valid");
					valid = true;
				} else {
					logger.info("username is invalid");
					if (username == null) {
						logger.info("username is null");
					}
					if (username != null && username.length() < 5) {
						logger.info("name length is less than 5");
					}
					valid = false;
				}
				String email = commonControllerDTO.getEmail();
				if (email != null && !email.isEmpty() && email.length() >= 5) {
					logger.info("email is valid");
					valid = true;
				} else {
					if (valid) {
						logger.info("email is invalid");
						valid = false;

					}
				}

			}

			// return valid;
			if (valid) {
				logger.info("Data is valid ,will convert  to entity");

				CommonControllerEntity commonControllerEntity = new CommonControllerEntity();

				BeanUtils.copyProperties(commonControllerDTO, commonControllerEntity);
				CommonControllerEntity commonControllerEntity1 = commonControllerDAO.fetchByEmail(commonControllerDTO.getEmail());
				if (commonControllerEntity1 == null) {
					logger.info("entity is ready \t " + commonControllerEntity);
					commonControllerDAO.save(commonControllerEntity);
					logger.info("entity is saved");
				} else {
					logger.info("entity as saved email already excits" + commonControllerDTO.getEmail());

				}
			}
			long mobile = commonControllerDTO.getMobile();
			if (mobile == 10) {
				logger.info("mobile number is valid");
				valid = true;
			} else {
				if (mobile != 10) {
					logger.info("mobile number  is invalid");

					valid = false;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}



