package com.atguigu.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * 谷粒商城的 仓储 服务
 *
 * @author gongchengship@163.com
 */

@EnableOpenApi
@MapperScan("com.atguigu.gulimall.ware.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguigu.gulimall.ware.feign")
public class GulimallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallWareApplication.class, args);
	}

}
