package com.ektha.app;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ektha.app.entity.Bid;
import com.ektha.app.entity.Item;
import com.ektha.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Item item = session.get(Item.class,1);
		
		System.out.println(item);
		
		System.out.println("\n List of bids :");
		
//		Set<Bid> bids = item.getb
	}

}
