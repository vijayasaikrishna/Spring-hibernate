package com.journaldev.spring.controller;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import net.roseindia.model.*;

public class CreateData {
						public static void main(String userName, String password) throws Exception {

		System.out.println("Main method reached");
/*	
 * 78s	
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Employee emp = new Employee();

		//emp.setId(1);
		emp.setEmpName("Sai");
		emp.setEmpMobileNos("7799840055");
		emp.setEmpAddress("Hyderabad - India");
			
		session.save(emp);
		
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
*/
		
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		//		Employee emp = new Employee();

		System.out.println("Session factory created");
		List passList =session.createQuery("FROM Password").list();
		Iterator i= passList.iterator();
		//org.hibernate.Transaction tr = session.beginTransaction();
		//	Employee emp1;
		Password p1;
		
		while(i.hasNext())
		{
			p1= (Password)i.next();
			System.out.println(p1.getUserName()+" "+ p1.getPassword());
		}
		
		//	session.close();
		tr.commit();
						
		System.out.println("listing usernames, passwords successfully completed");						
						
		addPassword(userName,password,passList);
		//	tr.commit();
		//session.close();
		//tr.commit();
		//	System.out.println("Successfully inserted");
		//sessFact.close();
	
	
		
	//addEmployee();
		
		
		
	//listEmployees();
	

	
						 		}
	
	public static void addPassword(String name,String password,List passList) {
		

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();
	//	Employee emp = new Employee();
		Password pass=new Password();

		
		//emp.setId(1);
		/*emp.setEmpName("Vijaya Sai Krishna Nallapati");
		emp.setEmpMobileNos("7799840055");
		emp.setEmpAddress("Hyderabad - India");
			*/
		Iterator i=passList.iterator();
				while(i.hasNext())
				{
					Password pass2=(Password)i.next();
					if(pass2.getUserName().equals(name))
						
					{
						System.out.println("UserName already exists, Break here ! try again");
						Error e= new Error();
						throw e;
					
					}
				}		
		
		pass.setUserName(name);
		pass.setPassword(password);
				
		session.save(pass);
		session.clear();
		session.close();
		
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
	}
}





