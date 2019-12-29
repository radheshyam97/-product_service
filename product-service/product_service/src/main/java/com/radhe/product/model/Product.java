package com.radhe.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

	@JsonProperty("product_id")
	long prodId;

	@JsonProperty("product_name")
	String prodName;

	@JsonProperty("product_price")
	double prodPrice;

	public long getProdId() {
		return prodId;
	}

	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}

}
