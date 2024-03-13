package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * 谷粒商城的 商品 服务
 *
 * @author gongchengship@163.com
 */
@EnableOpenApi  //开启swagger文档功能，默认是关闭的，可以在配置文件中配置，也可以在这里配置
//#Tell Mybatis that where the object-table-mapping files (mapper.xml) are.
//# 使用了@org.apache.ibatis.annotations.Mapper注解之后,就不需要mapper-locations配置了。mapper.xml已经备份成了 zip 包，
//# 原 mapper.xml文件已删除
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguigu.gulimall.product.feign")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
