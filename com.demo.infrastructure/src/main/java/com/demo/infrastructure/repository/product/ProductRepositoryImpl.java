package com.demo.infrastructure.repository.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.demo.domainmodel.product.Product;
import com.demo.domainmodel.product.ProductRepository;
import com.demo.infrastructure.repository.Database;

import easy.domain.repository.framework.IDao;

public class ProductRepositoryImpl implements ProductRepository, IDao {

	@Override
	public void add(Product product) {
		SqlSessionFactory factory = Database.getSessionFactory();
		try (SqlSession session = factory.openSession(true)) {
			session.insert("Product.Add", product);
		}
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findBy(Integer[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findBy(Integer id) {
		SqlSessionFactory factory = Database.getSessionFactory();
		try (SqlSession session = factory.openSession()) {
			return session.selectOne("Product.findById", id);
		}
	}

	@Override
	public void remove(Product arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Product arg0) {
		// TODO Auto-generated method stub

	}

}
