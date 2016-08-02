package com.demo.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.demo.application.user.adduserdomainevents.AddUserDomainEvent;
import com.demo.domainmodel.RepositoryRegistry;

import easy.domain.application.BaseApplication;
import easy.domain.application.IDomainEventManager;
import easy.domain.application.IReturn;

public class UserApplication extends BaseApplication {

	Logger logHelper = LogManager.getLogger(UserApplication.class);

	public UserApplication(IDomainEventManager manager) {
		super(manager);
	}

	public IReturn addUser() {

		logHelper.info("this ok");

		ResourceBundle boundle = ResourceBundle.getBundle("config.a");
		String a = boundle.getString("a");

		String path = UserApplication.class.getResource("/a.properties")
				.getPath();
		Properties p = new Properties();
		String b = null;
		FileInputStream input;
		try {
			input = new FileInputStream(new File(path));
			p.load(input);

			b = p.get("a").toString();

		} catch (IOException e) {
			e.printStackTrace();
		}

		RepositoryRegistry.user().add(null);
		return this.writeAndPublishDomainEvent("addUser", "返回值 OK" + a + b,
				new AddUserDomainEvent(100));
	}
}
