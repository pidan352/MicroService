package com.lyl.pojo;

import java.io.Serializable;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/1
 */

public class Product implements Serializable {
	protected String name;
	protected String price;

	public Product() {
	}

	public Product(String name, String price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
