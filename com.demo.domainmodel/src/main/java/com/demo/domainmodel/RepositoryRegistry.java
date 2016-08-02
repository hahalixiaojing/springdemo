package com.demo.domainmodel;

import java.io.InputStream;

import com.demo.domainmodel.product.ProductRepository;
import com.demo.domainmodel.user.UserRepository;

import easy.domain.repository.framework.IRepositoryFactory;
import easy.domain.repository.framework.RepositoryFactoryBuilder;

public class RepositoryRegistry {
	private static IRepositoryFactory factory;

	private RepositoryRegistry() {
	}

	static {
		RepositoryFactoryBuilder builder = new RepositoryFactoryBuilder();
		InputStream stream = RepositoryRegistry.class
				.getResourceAsStream("/com/demo/infrastructure/repository/repository.xml");

		factory = builder.build(stream);
	}

	public static UserRepository user() {
		return factory.get(UserRepository.class);
	}
	
	public static ProductRepository product(){
		return factory.get(ProductRepository.class);
	}
}
