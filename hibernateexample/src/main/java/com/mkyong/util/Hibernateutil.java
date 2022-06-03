package com.mkyong.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
	private static final SessionFactory sessionFactory= builtSessionFactory();
	 private static SessionFactory builtSessionFactory() {
		 try {
			 return new Configuration().configure().buildSessionFactory();

		 }catch (Throwable ex) {
			 
			 System.err.println("Initial SessionFactory creation Failed" + ex);
			 throw new ExceptionInInitializerError(ex);
			
		 }
	 }
	  public static SessionFactory getSessionFactory() {
		  return sessionFactory;
	  }
	  
	  public static void shutdown() {
		  getSessionFactory().close();
	  }
	  

	  
	  
	  }
		 
	 


