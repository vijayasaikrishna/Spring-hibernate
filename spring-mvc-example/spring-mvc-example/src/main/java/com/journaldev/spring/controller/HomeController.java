package com.journaldev.spring.controller;


import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.User;
import com.journaldev.spring.model.User1;
import com.journaldev.spring.controller.CreateData;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;

@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home1(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime1", formattedDate);

		return "home1";
	}

	@RequestMapping(value = "/User1", method = RequestMethod.POST)
	public String user1(@Validated User1 user, Model model) {
		System.out.println("User1 reached");
		String userpass=user.getPassword();
		String username= user.getUserName();
		System.out.println(userpass);
		String userpass1=user.getPassword1();
		System.out.println(userpass1);
		if(userpass.equals(userpass1))
		{
			try {
		Class abc= Class.forName("com.journaldev.spring.controller.CreateData");
	System.out.println("your passwords match");
	
	//DO MAVEN BASED PROJECT FOR HIBERNATE SPRING INTEGRATION
	
	//Class<String> mainstring[];
	
	Class[]  s= {String.class,String.class };
//	Method method=abc.getMethod("main",s );

	Method method=abc.getMethod("main",s);

	String main="";
	
	method.invoke(main,username,userpass);
	//	Method m= findMain(abc);
	
	/*	try {
	SessionFactory sessFact = HibernateUtil.getSessionFactory();
	Session session = sessFact.openSession();
	org.hibernate.Transaction tr = session.beginTransaction();

System.out.println("hi1");

	List pass =session.createQuery("FROM Password").list();
	Iterator i= pass.iterator();
	//org.hibernate.Transaction tr = session.beginTransaction();
	//Employee emp1;
	
	Password p1;
	
	while(i.hasNext())
	{
 p1= (Password)i.next();

 if(p1.getUserName()==user.getUserName())
 {
	 // throw error;
System.out.println("username already exists choose a different username");

 }
 
System.out.println(p1.getUserName()+" "+ p1.getPassword());

}
	

		Password p = new Password();

		//emp.setId(1);
		
		//p.setPassword("");
		p.setUserName(user.getUserName());
		p.setPassword(user.getPassword1());
			
		session.save(p);
		session.clear();
		session.close();
		
		tr.commit();
		System.out.println("Successfully inserted");
		session.close();
	System.out.println("hi2");
	}catch(Exception e){
		
	System.out.println("error");
	}

*/
				}catch (Exception e )
			{
					
				System.out.println(e.toString());
					
			}
}	
		else {
			System.out.println( " sorry passwords dont match ");
			
			Error e=new Error();
			throw e;
		
		}
model.addAttribute("userName", user.getUserName());
model.addAttribute("password1",user.getPassword1());
model.addAttribute("password",user.getPassword());

		return "user1";
	}
	
	@RequestMapping(value = "/User", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("password",user.getPassword());
		
		return "user";
	}
	
}

 