package com.demo.application.user.adduserdomainevents;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.demo.domainmodel.RepositoryRegistry;
import com.demo.domainmodel.product.Product;

import easy.domain.activemqdomainevent.IActiveMqDomainEventSubscriber;
import easy.domain.event.IDomainEvent;

public class SendWechatSubscriber implements IActiveMqDomainEventSubscriber {

	@Override
	public void handleEvent(String arg0) {
		System.out.println("thread id=" + Thread.currentThread().getId());
		Product p = new Product(2);
		p.setCategoryId(1);
		p.setCreateDate(LocalDateTime.now());
		p.setFoodConverPicUrl("http://www.baidu.com");
		p.setFoodStatus(1);
		p.setName("abc");
		p.setPrice(new BigDecimal("100.23"));
		p.setSort(1);
		p.setUnit("克");
		p.setSaleStatus(1);

		RepositoryRegistry.product().add(p);
	}

	@Override
	public <T extends IDomainEvent> Class<?> suscribedToEventType() {
		return AddUserDomainEvent.class;
	}
}
