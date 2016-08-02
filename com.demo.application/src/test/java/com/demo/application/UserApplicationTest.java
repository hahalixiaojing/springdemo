package com.demo.application;

import org.junit.Test;

public class UserApplicationTest {
	
	@Test
	public void addTest(){
		ApplicationRegistry.user().addUser();
	}
}
