package com.demo.application;

import java.time.LocalDateTime;

import easy.domain.application.BaseApplication;
import easy.domain.application.IReturn;

import com.demo.application.user.adduser.models.AddProduct;
import com.demo.domainmodel.RepositoryRegistry;
import com.demo.domainmodel.product.*;

public class ProductApplication extends BaseApplication {
	public void add(AddProduct addproduct) {

		Product p = new Product(addproduct.getRestaurantId());
		p.setCategoryId(addproduct.getCategoryId());
		p.setCreateDate(LocalDateTime.now());
		p.setFoodConverPicUrl(addproduct.getFoodConverPicUrl());
		p.setFoodStatus(addproduct.getFoodStatus());
		p.setName(addproduct.getName());
		p.setPrice(addproduct.getPrice());
		p.setSort(addproduct.getSort());
		p.setUnit(addproduct.getUnit());
		p.setSaleStatus(addproduct.getSaleStatus());

		RepositoryRegistry.product().add(p);
	}
	
	public IReturn findBy(int id){
		Product p = RepositoryRegistry.product().findBy(new Integer(id));
		
		return this.write("findBy", p);
	}
}
