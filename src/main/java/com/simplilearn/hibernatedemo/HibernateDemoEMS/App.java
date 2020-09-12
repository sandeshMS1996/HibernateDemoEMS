package com.simplilearn.hibernatedemo.HibernateDemoEMS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.simplilearn.hibernatedemo.HibernateDemoEMS.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 1. Load Configuration
    	StandardServiceRegistry  sService = new StandardServiceRegistryBuilder()
    			.configure("hibernate.cfg.xml").build();
    	Metadata meta = new MetadataSources(sService).getMetadataBuilder().build();
    	
    	
    	// 2. Create Session factory
    	SessionFactory factory = meta.getSessionFactoryBuilder().build();
    	
    	// 3 . Open Session
    	Session session = factory.openSession();
    	
    	// 4. Begin transaction
    	Transaction trans = session.beginTransaction();
    	
    	// 5. Create a Employee Object
    	Employee emp = new Employee();
    	emp.setId(100);
    	emp.setEmpName("John  Smith");
    	emp.setSalary(1000.077);
    	emp.setDepartement("Engineering");
    	
    	// 6. save emp object
    	session.save(emp);
    	
    	//7. commit transaction
    	trans.commit();
    	
    	System.out.println("Employee Record is created !");
    	
    	//clean up
    	factory.close();
    	session.close();
    	
    	
    	
    }
}
