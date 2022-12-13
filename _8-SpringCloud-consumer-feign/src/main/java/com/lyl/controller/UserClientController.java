package com.lyl.controller;

import com.lyl.service.UserFeignService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/6
 */

@RestController
public class UserClientController {

	@Autowired
	private UserFeignService userFeignService;

	@GetMapping("/findUserList")
	public List<String> findUserList() {
		return userFeignService.findUserList();
	}
}
