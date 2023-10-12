package com.thursdaylab.StudentCourse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.thursdaylab.entity.Course;
import com.thursdaylab.entity.Student;

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
		  Student s=new Student();
		  s.setSName("Sanjay");
		  
		  Course c1=new Course();
		  c1.setName("Java Programming");
		  c1.setStudent(s);
		  
		  Course c2=new Course();
		  c2.setName("Python");
		  c2.setStudent(s);
		  
		  s.getCourse1().add(c1);
		  s.getCourse1().add(c2);
		  
		  Course c=new Course();
		  c.setName("C++");
		  
		  Student s1=new Student();
		  s1.setSName("Ajay");
		  s1.setCourse(c);
		  
		  Student s2=new Student();
		  s2.setSName("Neel");
		  s2.setCourse(c);
		  
		  c.getStudent1().add(s1);
		  c.getStudent1().add(s2);
		  
		  session.beginTransaction();
		  session.save(c);
		  session.getTransaction().commit();

		  // Then save the students
		  session.beginTransaction();
		  session.save(s);
		  session.getTransaction().commit();
		
		 }
		finally 
		{
			session.close();
            sessionFactory.close();
		}
    }
}
