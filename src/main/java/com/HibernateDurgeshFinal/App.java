package com.HibernateDurgeshFinal;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //So, now mare hibernate.cfg.xml file ne base file gani ne baki nu 
        //configuration karwanu 6e.
        
        //STEP 1: We need to create an Object of SessionFactory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        //Take the class whose data you want to store in databse table using Hibernate
        Employee objEmployee = new Employee();
        objEmployee.setId(3);
        objEmployee.setFirstName("Viaan");
        objEmployee.setLastName("Jain");
        objEmployee.setCity("New York");
        
        //SESSIONS INITIALIZE KARE, AENI PAHELA TARA OBJECTS SET KARI DE.
        StudentAddress studentObjAddress = new StudentAddress();
        
        //Have badhi properties ni values set kari de.
        //Have mare Id set karwani jarur nathi, because that is AutoIncrement
        //studentObjAddress.setAddressId();
        studentObjAddress.setStreet("Wythe Way");
        studentObjAddress.setCity("Rocky Mount");
        studentObjAddress.setOpen(true);
        studentObjAddress.setX(22.98);
        studentObjAddress.setAddressDate(new Date());
        //studentObjAddress.setImage(image);

        
        //STEP 2: CREATE a Session of Session Interface
        Session session = factory.openSession();
        
        //STEP 3: SInce we need to follow ACID Property, begin a Transaction
        Transaction tx = session.beginTransaction();
        
        //STEP 4: with the help of the session actually store your Object into table
        session.save(objEmployee);
        session.save(studentObjAddress);
        
        //STEP 5: commit the transaction
        tx.commit();
        
        //STEP 6: close the session
        session.close();
          
        
    }
}
