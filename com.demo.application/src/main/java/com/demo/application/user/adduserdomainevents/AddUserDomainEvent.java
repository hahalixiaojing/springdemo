package com.demo.application.user.adduserdomainevents;

import easy.domain.event.IDomainEvent;

public class AddUserDomainEvent implements IDomainEvent {

	private Integer id;
	
	public AddUserDomainEvent(){}
	
	public AddUserDomainEvent(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
}
