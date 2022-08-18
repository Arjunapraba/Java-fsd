package com;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
  
    public static void Productdetail( Product_data pd )  
    { 	
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

       SessionFactory factory = meta.getSessionFactoryBuilder().build();
       Session session = factory.openSession();
       Transaction t = session.beginTransaction();
           
       session.save(pd);  // persist state---> saving into database
      
       t.commit();  // commit() in DB
       System.out.println("successfully saved");    
       factory.close();  
       session.close();    //detached state
    }  
}  
