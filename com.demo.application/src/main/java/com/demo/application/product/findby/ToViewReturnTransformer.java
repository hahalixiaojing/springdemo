package com.demo.application.product.findby;

import java.time.format.DateTimeFormatter;
import com.demo.application.product.models.ToViewProductModel;
import com.demo.domainmodel.product.Product;
import easy.domain.application.IReturnTransformer;
import easy.domain.application.ReturnContext;

public class ToViewReturnTransformer implements IReturnTransformer {

	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public Object getValue(ReturnContext arg0, Object arg1) {
		Product p = (Product) arg1;

		ToViewProductModel model = new ToViewProductModel();
		model.setCreateDate(p.getCreateDate().format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		model.setName(p.getName());
		model.setPrice(p.getPrice());
		model.setUnit(p.getUnit());

		return model;
	}

	@Override
	public boolean isMapped(ReturnContext arg0) {
		if (arg0.systemId.toUpperCase().equals("VIEW")) {
			return true;
		}
		return false;
	}

}
