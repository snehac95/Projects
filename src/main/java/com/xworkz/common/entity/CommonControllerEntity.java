package com.xworkz.common.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import com.xworkz.common.dto.LoginControllerDTO;

import lombok.Data;
@Component
@Entity
@Table(name="modules1")
@Data
//@NamedOuery(name="fetchByEmail",query="select ce from  CommonModulesEntity ce where ce.email=:email")
//@NamedQueries({@NamedQuery(name="fetchByemail", query="select sign from CommonModulesEntity sign where sign.email=email"),
//@NamedQuery(name="fetchByEmailandPassword", query="select sign from CommonModulesEntity sign where sign.email=:email and sign.password=:password")})
public class CommonControllerEntity  implements Serializable{
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name ="id")
	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String  email;
	@Column(name = "mobile")
	private long mobile;
	@Column(name = "password")
	private String password;

//	@Column(name ="confirmpassword")
//	private String confirmpassword;
	private static Logger logger = Logger.getLogger(CommonControllerEntity.class);
	


	public CommonControllerEntity() {
		logger.info("Created \t" + this.getClass().getSimpleName());
	}

	public CommonControllerEntity(String username,String email,long mobile,String password) {
		//super();
		username = username;
		email = email;
		mobile= mobile;
		 password=password;
		 
		
		
	}
	

}








