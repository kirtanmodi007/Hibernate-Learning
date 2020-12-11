package com.HibernateDurgeshFinal;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneMapMain {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		
		
		factory.close();
	}

}
