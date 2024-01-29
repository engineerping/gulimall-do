package com.atguigu.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * 谷粒商城的 订单 服务
 *
 * @author gongchengship@163.com
 */

@EnableOpenApi
@MapperScan("com.atguigu.gulimall.order.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguigu.gulimall.order.feign")
public class GulimallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallOrderApplication.class, args);
	}

}
