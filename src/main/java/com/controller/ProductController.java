package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;

@Controller
public class ProductController {

	@GetMapping("/newproduct")
	public String newProduct(Model model) {
		ProductBean product = new ProductBean();
		model.addAttribute("product",product);
		return "NewProduct";

	}

	@PostMapping("/saveproduct")
	public String saveProduct(@ModelAttribute("product")  @Valid ProductBean product, BindingResult result,Model model) {

		model.addAttribute("product",product);
		if (result.hasErrors()) {
			return "NewProduct";
		} else {

			System.out.println(product.getProductName());
			return "Home";
		}
	}

}
