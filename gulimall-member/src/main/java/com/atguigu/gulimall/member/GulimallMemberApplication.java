package com.atguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * 谷粒商城的 会员 服务
 * 1. 想要远程调用别的服务的步骤
 * 	1.1. 引入open-feign 依赖
 * 	1.2. 编写一个接口，告诉spring-cloud这个接口需要调用远程服务
 * 		1.2.1. 在接口内的方法上借助@RequestMapping注解去说明，接口的每一个方法都是调用哪个远程服务的那个RestAPI接口
 * 	1.3. 在springboot 启动类上标注@EnableDiscoveryClient 以开启远程调用功能。
 * 2. 被调用方无需做特殊处理，它就是个普通的 Restful API
 *
 * @author gongchengship@163.com
 */

@EnableOpenApi
@MapperScan("com.atguigu.gulimall.member.dao")
@SpringBootApplication
//For Nacos
@EnableDiscoveryClient
//为 Springboot 启动 FeignClient的功能；
//参数basePackages是让 Springboot 启动时，去扫描basePackages路径下的标注了@FeignClient的接口，为之生成实现类，无参则扫启动类所在的整个包
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
public class GulimallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallMemberApplication.class, args);
	}

}
