package com.lyl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/6
 */

@RestController
public class UserController {

	@Value("${server.port}")
	private String port;

	@GetMapping("/findUserList")
	public List<String> findUserList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add(port);

		return list;
	}
}
