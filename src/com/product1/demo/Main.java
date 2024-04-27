package com.product1.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
		/*	Product p1 = new Product("Moblie",75000,65,"I Phones","Indian Dellar");
			Product p2 = new Product("Laptop",36000,115,"Dell Laptops","USA Dellar");
			Product p3 = new Product("Watch",15000,75,"Noise Wathes","China Dellar");
			Product p4 = new Product("Pen Driver",2500,90,"HP Brand","Thailand Dellar");
			
			
			session.save(p1);
			session.save(p2);
			session.save(p3);
			session.save(p4); */
			
			Product pr = session.get(Product.class, 4);
			
			System.out.println(pr);
					
			
		}catch(HibernateException e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
		}catch(Exception e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
		}finally {
			if(tx != null)
				tx.commit();
			if(sessionFactory != null)
				sessionFactory.close();
		} 
		
		
	/*  SessionFactory sf = null;
		Session s = null ;
		Transaction tx = null;
		
		try {
			sf = new Configuration().configure().buildSessionFactory();
			s = sf.openSession();
			tx = s.beginTransaction();
			
			Product p1 = new Product(1,"MOBILE",75000,65,"I Phones","Indian Dellar");
			Product p2 = new Product(2,"LAPTOP",36000,115,"Dell Laptops","USA Dellar");
			Product p3 = new Product(3,"WATCH",15000,75,"Noise Wathes","China Dellar");
			Product p4 = new Product(4,"PEN Driver",2500,90,"HP Brand","Thailand Dellar");
			
			s.update(p1);
			s.update(p2);
			s.update(p3);
			s.update(p4);
			
		}catch(HibernateException e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
			
		}catch(Exception e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
		}finally {
			if(tx != null)
				tx.commit();
			if(sf != null)
				sf.close();
		}*/
		
		/*
		SessionFactory sf = null;
		Session s = null ;
		Transaction tx = null;
		
		try {
			sf = new Configuration().configure().buildSessionFactory();
			s = sf.openSession();
			tx = s.beginTransaction();
			
		
			Product p1 = new Product(1,"MOBILE",75000,65,"I Phones","Indian Dellar");
			Product p2 = new Product(2,"LAPTOP",36000,115,"Dell Laptops","USA Dellar");
			Product p3 = new Product(3,"WATCH",15000,75,"Noise Wathes","China Dellar");
			Product p4 = new Product(4,"PEN Driver",2500,90,"HP Brand","Thailand Dellar");
			
		    s.delete(p1);
		    s.delete(p2);
		    s.delete(p3);
		    s.delete(p4);
			
		}catch(HibernateException e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
			
		}catch(Exception e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
		}finally {
			if(tx != null)
				tx.commit();
			if(sf != null)
				sf.close();
		}
		*/
       
	}

}
