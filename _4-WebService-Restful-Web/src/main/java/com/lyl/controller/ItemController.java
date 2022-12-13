package com.lyl.controller;

import com.lyl.pojo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/1
 */

@Controller
public class ItemController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/queryItems")
	public ModelAndView queryItems() {
		RespBean respBean = restTemplate.getForObject("http://localhost:8080/findAll", RespBean.class);
		ModelAndView mv = new ModelAndView();
		mv.addObject("itemList", respBean.getData());
		mv.setViewName("itemlist");
		return mv;
	}
}
