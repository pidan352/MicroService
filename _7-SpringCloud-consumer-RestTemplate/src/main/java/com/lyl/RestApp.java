package com.lyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/6
 */

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class RestApp {
	public static void main(String[] args) {
		SpringApplication.run(RestApp.class, args);
	}

	@Bean
	@LoadBalanced //添加了Ribbon功能
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
