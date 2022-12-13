package com.lyl.service;

import com.lyl.mapper.ItemsMapper;
import com.lyl.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/1
 */

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<Items> findAll() {
		return itemsMapper.selectByExample(null);
	}

	@Override
	public Items findOne(Integer id) {
		return itemsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void addItems(Items items) {
		itemsMapper.insert(items);
	}

	@Override
	public void updateItems(Items items) {
		itemsMapper.updateByPrimaryKey(items);
	}

	@Override
	public void deleteItems(Integer id) {
		itemsMapper.deleteByPrimaryKey(id);
	}
}
