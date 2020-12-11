package com.HibernateDurgeshFinal;


import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbeddableClassMain {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Before we start the session, just fetch the object.
		Employee objEmployee = new Employee();
		
		objEmployee.setId(4);
		objEmployee.setFirstName("Virat");
		objEmployee.setLastName("Kohli");
		objEmployee.setCity("Delhi");
		
		//Now in order to set the certificate details, we need to create CERTIFICATE
		//class's object
		Certificate objCertificate = new Certificate();
		
		objCertificate.setCourseString("Java");
		objCertificate.setDurationString("1 month");
		
		//Now set karya pa6i j aapde objEmployee wada object through set kari shakiye
		objEmployee.setCerti(objCertificate);
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(objEmployee);
		
		tx.commit();
		
		session.close();
		
		
	}

}
