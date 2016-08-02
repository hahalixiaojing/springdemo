package com.demo.application.product.findby;

import org.apache.commons.lang3.StringUtils;

import com.demo.application.product.models.DefaultProductModel;
import com.demo.domainmodel.product.Product;

import easy.domain.application.IReturnTransformer;
import easy.domain.application.ReturnContext;

public class DefaultReturnTransformer implements IReturnTransformer {

	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public Object getValue(ReturnContext arg0, Object arg1) {
		Product p = (Product) arg1;
		
		DefaultProductModel model =new DefaultProductModel();
		model.setCreateDate(p.getCreateDate());
		model.setName(p.getName());
		model.setPrice(p.getPrice());
		model.setUnit(p.getUnit());
		
		return model;
	}

	@Override
	public boolean isMapped(ReturnContext arg0) {
		if(StringUtils.isBlank(arg0.systemId)){
			return true;
		}
		return false;
	}

}
