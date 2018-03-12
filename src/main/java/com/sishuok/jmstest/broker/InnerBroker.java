package com.sishuok.jmstest.broker;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URI;


public class InnerBroker {
	public static void main(String[] args)throws Exception {
		
		BrokerService broker = new BrokerService();

		broker.setUseJmx(true);

		broker.addConnector("tcp://localhost:61616");

		broker.start();
		
//		String Uri = "properties:broker.properties";
//		BrokerService broker1 = BrokerFactory.createBroker(new URI(Uri));
//		broker1.addConnector("tcp://localhost:61716");
//		broker1.start();
//
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//
	}
}
