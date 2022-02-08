package com.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductBean {

	@NotBlank(message="Please Enter ProductName")
	String productName;
	@Min(value=1,message="Please Enter price >= 1 ")
	int price;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
