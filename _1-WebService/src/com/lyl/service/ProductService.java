package com.lyl.service;

import com.lyl.pojo.Product;

import javax.jws.WebService;
import java.util.List;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/1
 */

@WebService         //可发布的web接口
public interface ProductService {
	public List<Product> findAllProducts();
}
