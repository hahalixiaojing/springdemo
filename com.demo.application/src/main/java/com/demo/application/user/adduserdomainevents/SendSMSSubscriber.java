package com.demo.application.user.adduserdomainevents;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import easy.domain.activemqdomainevent.IActiveMqDomainEventSubscriber;
import easy.domain.event.IDomainEvent;

public class SendSMSSubscriber implements IActiveMqDomainEventSubscriber {
	Logger logHelper =LogManager.getLogger(SendSMSSubscriber.class);
	@Override
	public void handleEvent(String arg0) {
		
		System.out.println("thread id="+ Thread.currentThread().getId());
		System.out.println(arg0);
		
		logHelper.info("thread a");
		
	}
	@Override
	public <T extends IDomainEvent> Class<?> suscribedToEventType() {
		return AddUserDomainEvent.class;
	}
}
