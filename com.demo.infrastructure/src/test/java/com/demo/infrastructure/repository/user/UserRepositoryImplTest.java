package com.demo.infrastructure.repository.user;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.Assert;

import org.junit.Test;

import com.demo.domainmodel.RepositoryRegistry;
import com.demo.domainmodel.product.Product;
import com.demo.infrastructure.repository.Database;

public class UserRepositoryImplTest {

	@Test
	public void pathTest() {

		String path = UserRepositoryImpl.class.getResource("/").getPath();
		System.out.print(path);

		Database.getSessionFactory();
	}

	@Test
	public void findByIdTest() {
		Product p = newProduct();

		RepositoryRegistry.product().add(p);

		Assert.assertTrue(p.getId().intValue() > 0);

		Product actual = RepositoryRegistry.product().findBy(p.getId());

		Assert.assertEquals(p.getId(), actual.getId());
		Assert.assertEquals(p.getName(), actual.getName());
		Assert.assertTrue(p.getPrice().doubleValue() == actual.getPrice()
				.doubleValue());
		
		Assert.assertEquals(p.getCreateDate().toLocalDate(),actual.getCreateDate().toLocalDate());
		Assert.assertEquals(p.getCreateDate().toLocalTime().getHour(), actual.getCreateDate().toLocalTime().getHour());
		Assert.assertEquals(p.getUnit(), actual.getUnit());
		Assert.assertEquals(p.getCategoryId(), actual.getCategoryId());
	}

	private Product newProduct() {
		Product p = new Product(1);
		p.setCategoryId(1);
		p.setCreateDate(LocalDateTime.now());
		p.setName("好吃吃");
		p.setFoodConverPicUrl("http://www.baidu.com");
		p.setPrice(new BigDecimal("200.23"));
		p.setSort(1);
		p.setUnit("克");
		p.setFoodStatus(1);
		p.setSaleStatus(1);
		return p;
	}

}
