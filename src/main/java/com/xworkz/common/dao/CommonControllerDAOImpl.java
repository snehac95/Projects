package com.xworkz.common.dao;

import java.io.Serializable;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.common.controller.CommonController;
import com.xworkz.common.entity.CommonControllerEntity;
@Repository
public class CommonControllerDAOImpl implements CommonControllerDAO {

	@Autowired
	private SessionFactory factory;
	private static Logger logger = Logger.getLogger(CommonControllerDAOImpl.class);

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public CommonControllerDAOImpl() {
		logger.info("Created \t " + this.getClass().getSimpleName());
	}

	public Serializable save(CommonControllerEntity commonControllerEntity) {
		logger.info("Invoking save method");
		Session session = null;
		try {

			logger.info("session created");
			session = factory.openSession();
			logger.info("Transaction begun");
			session.beginTransaction();
			logger.info("Entity saving...");
			session.save(commonControllerEntity);
			logger.info("Commiting....");
			session.getTransaction().commit();
			logger.info("Data saved");

		} catch (Exception e) {
			e.printStackTrace();
			logger.info("INFO:" + e.getMessage());
		}

		return 0;
	}

	public CommonControllerEntity fetchByEmail(String email) {
		logger.info("fetchByEmail");
	Session session=factory.openSession();
		try {
			String syntax="SELECT SE from CommonControllerEntity SE where SE.email='"+email+"'";
			Query query=session.createQuery(syntax);
			Object result=query.uniqueResult();
			if(result!=null)
			return(CommonControllerEntity) result;
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		finally {
			//if(Objects.nonNull(session)) {
			session.close();
			System.out.println("session closed");
		}
		
		
		return null;
	}

	public CommonControllerEntity fetchByEmailandPassword(String password ,String email) {
		logger.info("fetchByEmailandPassword");
		Session session=factory.openSession();
		try {
			
			logger.info("invoke entity");
			
			Query query=session.getNamedQuery("fetchByEmailandPassword");
			query.setParameter("email", email);
			query.setParameter("password", password);
			logger.info("query " + query);
			Object result=query.uniqueResult();
			if(Objects.nonNull(result)) {
			logger.info("Entity found:"+email);
			CommonControllerEntity entity=(CommonControllerEntity) result;
			return entity;
			}
			else {
			logger.info("Entity not found");
				return null;
			}
	}catch(Exception e) {
		e.printStackTrace();
	
	}
	
	finally {
			if (Objects.nonNull(session))
				session.close();
		
	}
		return null;
	}

	public CommonControllerEntity changePasswordByEmail(String email, String password) {
		Session session=factory.openSession();
		try {
			
			logger.info("invoke entity");
			String syntax="SELECT SE from CommonModulesEntity SE where SE.email='"+email+"'";
			logger.info("checking for email fetch"+syntax);
//			Query query=session.getNamedQuery("changePasswordByEmail");
//			query.setParameter("password", password);
//			query.setParameter("email", email);
//			System.out.println("query " + query);
//			Object result=query.uniqueResult();
//			if(Objects.nonNull(result)) {
//			System.out.println("Entity found:"+email);
//			CommonModulesEntity entity=(CommonModulesEntity) result;
//			return entity;
		//}
			//else {
			logger.info("Entity not found");
				return null;
			//}
	}catch(Exception e) {
		e.printStackTrace();
	
	}
	
	finally {
			if (Objects.nonNull(session))
				session.close();
		
	}
		return null;
	}
}



