package com.lyl.controller;

import com.lyl.pojo.Items;
import com.lyl.pojo.RespBean;
import com.lyl.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/1
 */

@Api(tags = "ItemController", description = "商品后台信息服务接口")
@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;

	@ApiOperation("查询所有商品")
	@GetMapping("/findAll")
	public RespBean findAll() {
		return RespBean.ok("商品列表", itemService.findAll());
	}

	@ApiOperation("根据id查询唯一商品")
	@GetMapping("/findOne/{id}")
	public RespBean findOne(@PathVariable Integer id) {
		return RespBean.ok("一个商品", itemService.findOne(id));
	}

	@ApiOperation("添加一个商品")
	@PostMapping("/addItem")
	public RespBean addItem(@RequestBody Items item) {
		itemService.addItems(item);
		return RespBean.ok("添加成功");
	}

	@ApiOperation("根据id删除商品")
	@DeleteMapping("/deleteItem/{id}")
	public RespBean deleteItem(@PathVariable Integer id) {
		itemService.deleteItems(id);
		return RespBean.ok("删除成功");
	}

	@ApiOperation("修改商品信息")
	@PutMapping("/updateItem")
	public RespBean updateItem(@RequestBody Items item) {
		itemService.updateItems(item);
		return RespBean.ok("修改成功");
	}
}
