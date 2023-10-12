package com.ankita.HibernatePrac.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	 public static void main( String[] args )
	    {
	   
	    	Configuration cfg=new Configuration();
	    	cfg.configure("hibernate1.cfg.xml");
	    	SessionFactory factory=cfg.buildSessionFactory();
	    	Session session =factory.openSession();
	    	Transaction tx=session.beginTransaction();
	   	
	    	StudentDemo s=new StudentDemo();
			s.setId(2);
			s.setStudName("Joon");
			s.setAddress("Korea");
				
			session.save(s);
			tx.commit();
			session.close();
				
	    }	
}
