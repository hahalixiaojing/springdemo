package com.demo.web.utility;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerExceptionResolverComposite;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;

public class GlobalExceptionHandler extends HandlerExceptionResolverComposite {

	Logger logHelper = org.apache.log4j.LogManager
			.getLogger(GlobalExceptionHandler.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {


		logHelper.error("全局异常", ex);

		ModelAndView mv = new ModelAndView();
		FastJsonJsonView fastJsonView = new FastJsonJsonView();
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("code", 200);
		attributes.put("message", "系统错误");

		fastJsonView.setAttributesMap(attributes);
		mv.setView(fastJsonView);

		return mv;
	}
}
