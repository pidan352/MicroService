package com.lyl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/6
 */

//value指定访问微服务的名称
@FeignClient(value = "service-provider", fallback = UserFeignServiceFallback.class)
public interface UserFeignService {

	@GetMapping("/findUserList")
	List<String> findUserList();
}

@Component
class UserFeignServiceFallback implements UserFeignService {

	//重写接口方法，做熔断后的服务
	@Override
	public List<String> findUserList() {
		ArrayList<String> error = new ArrayList<>();
		error.add("服务故障！");
		return error;
	}
}
