package com.demo.web.controllers;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.application.ApplicationRegistry;

import easy.domain.application.IReturn;
import easy.domain.application.ReturnContext;

@Controller
@RequestMapping("/home")
public class HomeController {

	Logger logHelper = org.apache.log4j.LogManager.getLogger(HomeController.class);
	@RequestMapping("/index")
	public String index(@RequestParam(defaultValue = "A") String systemId,
			Model model) {
		
		IReturn rest = ApplicationRegistry.user().addUser();

		Object v = rest.result(new ReturnContext(systemId, StringUtils.EMPTY));

		model.addAttribute("m", v);

		return "/home/index";
	}
	@RequestMapping("/testex")
	public String testEx(){
		
		logHelper.info("this,测试日志");
		logHelper.info("this,测试日志");
		logHelper.info("this,测试日志");
		logHelper.info("this,测试日志");
		
		throw new NullPointerException("测试异常");
	}
}
