package com.demo.web.utility;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import easy.domain.activemqdomainevent.ActiveMqManagerFactory;

public class ActiveMqContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("初始化 MQ");
	}
	

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.print("clear active mq");
		ActiveMqManagerFactory.clear();
	}

}
