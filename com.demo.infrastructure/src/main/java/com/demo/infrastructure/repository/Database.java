package com.demo.infrastructure.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Database {

	private static final SqlSessionFactory factory;

	private Database() {

	}

	static {

		Properties p = new Properties();
		String filePath = Database.class.getResource("/db.properties").getPath();
		
		try {
			p.load(new FileInputStream(new File(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
		}

		InputStream stream = null;
		try {
			stream = Resources
					.getResourceAsStream("com/demo/infrastructure/repository/SqlMapConfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		factory = new SqlSessionFactoryBuilder().build(stream, p);
	}

	public static SqlSessionFactory getSessionFactory() {
		return factory;
	}
}
