package com.HibernateDurgeshFinal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDetailsMain {

	public static void main(String[] args)
	{
		//Have Sauthi pahela aapde je basic Configuration 6e, ae karwi pade.
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Have session Initialize kar.
		//Read operation ma tu actual ma database ma kai operation perform nathi akrto
		//So tu Transaction na create kare to pan chale.
		
		//Session Open
		Session session = factory.openSession();
		
		//DO, the Actual READ Operation.
		//Have tane je database mathi data malshe ae as a object malshe
		//So tare jete class na object mate set karwu pade.
		
		//Have fetch karawa mate hal hu ID thi load karaish
		Employee newObjEmployee = session.get(Employee.class, 2);
		
		//Database mathi row tu load() function use kari ne pan fetch kari shake.
		Employee newObjEmployee2 = session.get(Employee.class, 3);
		
		StudentAddress newObjStudentAddress = session.get(StudentAddress.class, 1);
		
		//Now jo me toString method initialize ari hase, to hu direct object ne
		//print pan kari shaku.
		
		System.out.println(newObjEmployee);
		System.out.println(newObjEmployee2);
		
		System.out.println(newObjStudentAddress);
		
		//Session Close
		session.close();
		
		factory.close();
		
	}

}
