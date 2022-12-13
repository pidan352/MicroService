package com.lyl.service;

import com.lyl.pojo.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/1
 */

public class ProductServiceImpl implements ProductService {
	@Override
	public List<Product> findAllProducts() {
		ArrayList<Product> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new Product("电视", "2000"));
		}
		return list;
	}
}
