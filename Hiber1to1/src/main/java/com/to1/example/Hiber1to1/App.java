package com.to1.example.Hiber1to1;

/**
 * Hello world!
 *
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.to1.example.Hiber1to1.entity.User;
import com.to1.example.Hiber1to1.entity.Address;

public class App 
{
    public static void main(String[] args) 
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try 
		{
		  User user=new User();
		  user.setUserName("Reena");
		  
		  Address address=new Address();
		  address.setStreet("123 Yours Street");
		  
		  user.setAddress(address);
		  address.setUser(user);
		  
		  session.save(user);
		  session.getTransaction().commit();
		
		  User retrievedUser=session.get(User.class, user.getId());
		  Address retrievedAddress=retrievedUser.getAddress();
		  
		  System.out.println("User: "+retrievedUser.getUserName());
		  System.out.println("Address: "+retrievedAddress.getStreet());
		}
		finally 
		{
			session.close();
            sessionFactory.close();
		}
	}
}