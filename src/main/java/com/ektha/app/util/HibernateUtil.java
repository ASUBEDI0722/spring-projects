package com.ektha.app.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.ektha.app.entity.Bid;
import com.ektha.app.entity.Item;


public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY;

	static {

		Configuration configuration = new Configuration();
		Properties properties = new Properties();

		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "java");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.SHOW_SQL, true);
		
		configuration.addAnnotatedClass(Item.class);
		configuration.addAnnotatedClass(Bid.class);


		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(properties).build();

		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
