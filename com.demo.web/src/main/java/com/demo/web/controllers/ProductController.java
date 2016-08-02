package com.demo.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.application.ApplicationRegistry;
import com.demo.application.product.models.DefaultProductModel;
import com.demo.application.product.models.ToViewProductModel;
import com.demo.application.user.adduser.models.AddProduct;

import easy.domain.application.ReturnContext;

@Controller
@RequestMapping("/product")
public class ProductController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "/product/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(AddProduct product) {

		ApplicationRegistry.product().add(product);

		return "/product/add";
	}

	@RequestMapping(value = "/findby", method = RequestMethod.GET)
	@ResponseBody
	public DefaultProductModel findBy(@RequestParam int productId) {
		return (DefaultProductModel) ApplicationRegistry.product()
				.findBy(productId).result(new ReturnContext());
	}
	@RequestMapping(value="/toview")
	public String findByToView(@RequestParam int productId,Model m){
		ToViewProductModel model = (ToViewProductModel) ApplicationRegistry.product()
				.findBy(productId).result(new ReturnContext("VIEW",""));
		
		m.addAttribute("product", model);
		
		return "/product/detail";
	}

}
