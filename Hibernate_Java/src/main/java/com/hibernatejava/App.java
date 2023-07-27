package com.hibernatejava;

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
        //SessionFactory
        // create a config project
        Configuration configuration = new Configuration();
        // read the config
        configuration.configure("hibernate.cfg.xml");

        // create factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // open the session
        Session session = sessionFactory.openSession();
        // begin the transaction
        Transaction transaction = session.beginTransaction();
        // create object
        Student student = new Student();
        student.setId(1);
        student.setName("shre");
        student.setEmail("shre23@gmail.com");
        //save the object
        session.save(student);
        //commit
        transaction.commit();
        // close the session
        session.close();
    }
}
