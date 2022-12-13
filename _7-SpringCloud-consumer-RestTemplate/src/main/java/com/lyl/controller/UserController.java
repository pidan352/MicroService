package com.lyl.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/loadUserList")
	@HystrixCommand(fallbackMethod = "getloadUserListFallback")
	public List<String> loadUserList() {
		//很显然用端口号写死来访问是不行的，无论是改了端口还是使用了集群，这种方式无法胜任
		//List<String> list = restTemplate.getForObject("http://localhost:8800/findUserList", List.class);

		//那我们通过使用服务提供方的应用程序名称来调用服务。
		//当使用了集群后，因为同一个服务的端口不同，就需要靠负载均衡来实现不同端口服务的访问
		//RestTemplate本身不具备负载均衡功能的，它本身就可以单独使用。
		//而在springcloud中使用时就可以配合其他工具来实现负载均衡的功能，如使用Ribbon工具
		List<String> list = restTemplate.getForObject("http://service-provider/findUserList", List.class);
		return list;
	}

	//Hystrix回退方法
	//签名与请求方法一致
	//当请求方法中的远程方法调用，比如说已经失效，那么调用出错后就调用改回退方法
	public List<String> getloadUserListFallback() {
		//可以做错误处理，也可以做服务的降级处理等
		ArrayList<String> error = new ArrayList<>();
		error.add("远程服务访问出错！");
		return error;
	}

}
