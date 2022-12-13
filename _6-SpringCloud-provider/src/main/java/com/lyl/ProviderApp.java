package com.lyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能：
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/6
 */

@SpringBootApplication
@EnableEurekaClient
public class ProviderApp {
	public static void main(String[] args) {
		SpringApplication.run(ProviderApp.class, args);
	}
}
