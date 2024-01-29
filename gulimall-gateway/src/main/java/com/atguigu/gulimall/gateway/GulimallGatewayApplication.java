package com.atguigu.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 基本概念
 * 路由（Route）是 GateWay 中最基本的组件之一，表示一个具体的路由信息载体，主要由下面几个部分组成：
 *
 * 1. id：路由唯一标识，也可以称为路由的 name, 用于唯一代表一个 route
 * 2. predicate：断言的作用是进行条件判断，只有断言为 true，才会将客户端原始请求 路由 route 给 下面所配置的 uri
 * 3. filter: 但是,过滤器用于修改请求和响应信息
 * 4. uri：断言为 true的情况下,将客户端原始请求 路由 route 给所配置的这个 uri
 * 5. order：用于干预多个 route 之间的排序，数值越小越靠前，匹配优先级越高
 */

@EnableDiscoveryClient //让自己被注册中心发现
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //排除数据池，避免报
public class GulimallGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallGatewayApplication.class, args);
	}

}
