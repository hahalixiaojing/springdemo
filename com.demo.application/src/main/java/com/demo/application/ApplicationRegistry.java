package com.demo.application;

import easy.domain.activemqdomainevent.ActiveMqDomainEventManager;
import easy.domain.activemqdomainevent.ActiveMqManager;
import easy.domain.activemqdomainevent.ActiveMqManagerFactory;
import easy.domain.application.ApplicationFactory;

public class ApplicationRegistry {
	static {

		ActiveMqManager activeMqManager = ActiveMqManagerFactory
				.createActiveMqManager(
						"tcp://127.0.0.1:61616?wireFormat.maxInactivityDuration=0",
						"userapplication");

		ActiveMqDomainEventManager mqManager = new ActiveMqDomainEventManager(
				activeMqManager);

		ApplicationFactory.instance().register(new UserApplication(mqManager));
		ApplicationFactory.instance().register(new ProductApplication());
	}

	private ApplicationRegistry() {

	}

	public static UserApplication user() {
		return ApplicationFactory.instance().get(UserApplication.class);
	}

	public static ProductApplication product() {
		return ApplicationFactory.instance().get(ProductApplication.class);
	}
}
