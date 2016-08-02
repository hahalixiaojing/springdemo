package com.demo.application.user.adduser;

import easy.domain.application.IReturnTransformer;
import easy.domain.application.ReturnContext;

public class BAddUserReturnTransformer implements IReturnTransformer {

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValue(ReturnContext arg0, Object arg1) {

		return "B" + arg1.toString();
	}

	@Override
	public boolean isMapped(ReturnContext arg0) {
		return arg0.systemId.equals("B");
	}

}
