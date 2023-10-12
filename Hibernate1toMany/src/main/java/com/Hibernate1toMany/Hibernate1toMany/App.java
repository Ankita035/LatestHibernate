package com.Hibernate1toMany.Hibernate1toMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Hibernate1toMany.Hibernate1toMany.model.Department;
import com.Hibernate1toMany.Hibernate1toMany.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		try 
		{
		  Department department=new Department();
		  department.setName("IT");
		  
		  Employee emp1=new Employee();
		  emp1.setName("Amit");
		  emp1.setDepartment(department);
		  
		  Employee emp2=new Employee();
		  emp2.setName("Arun");
		  emp1.setDepartment(department);
		  
		  department.getEmployees().add(emp1);
		  department.getEmployees().add(emp2);
		  
		  session.beginTransaction();
		  session.save(department);
		  session.getTransaction().commit();
		
		 }
		finally 
		{
			session.close();
            sessionFactory.close();
		}
    }
}
