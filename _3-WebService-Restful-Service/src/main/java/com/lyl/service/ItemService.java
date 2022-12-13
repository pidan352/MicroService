package com.lyl.service;

import com.lyl.pojo.Items;

import java.util.List;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/1
 */

public interface ItemService {

	List<Items> findAll();

	Items findOne(Integer id);

	void addItems(Items items);

	void updateItems(Items items);

	void deleteItems(Integer id);

}
