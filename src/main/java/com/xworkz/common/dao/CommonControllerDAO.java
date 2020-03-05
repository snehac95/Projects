package com.xworkz.common.dao;

import java.io.Serializable;

import com.xworkz.common.entity.CommonControllerEntity;

public interface CommonControllerDAO {
	public Serializable save(CommonControllerEntity commonControllerEntity);
	public CommonControllerEntity fetchByEmail(String email);
	public CommonControllerEntity fetchByEmailandPassword(String password, String email);
	public  CommonControllerEntity changePasswordByEmail(String email,String password);

	}





