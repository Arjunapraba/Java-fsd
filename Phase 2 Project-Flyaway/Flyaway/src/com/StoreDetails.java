package com;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
  
public class StoreDetails {  
  
    public static void add( flight_data pd )  
    { 	
       StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
       Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

       SessionFactory factory = meta.getSessionFactoryBuilder().build();
       Session session = factory.openSession();
       Transaction t = session.beginTransaction();
           
       session.save(pd);  
      
       t.commit();  
       System.out.println("successfully saved");    
       factory.close();  
       session.close();        
    }  
}  
