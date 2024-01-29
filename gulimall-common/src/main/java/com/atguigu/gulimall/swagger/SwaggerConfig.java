package com.atguigu.gulimall.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author  gongchengship@163.com
 */

@Configuration //本行这个 @Configuration 注解 不是必须的,因为这个类是专门用于被其他的 Configuration 类锁继承的.
// This is not required for swagger to work, 这个类对于让 swagger 开始工作而言, 不是必须的
public class SwaggerConfig {

    /**
     * 用于读取配置文件 application.yml 中 swagger 属性是否开启
     */
    @Value("${swagger.enabled:false}") //默认false，如果需要swagger，需要在配置文件中配置swagger.enabled=true
    Boolean swaggerEnabled;

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("gulimall-product")
                .apiInfo(apiInfo())
                // 可以再次控制是佛 enable swagger
                .enable(swaggerEnabled)
                .select()
                // 过滤条件，扫描指定路径下的文件
                //.apis(RequestHandlerSelectors.basePackage("com.atguigu.gulimall")) // 默认会扫描 @Controller 类
                // 指定路径处理，PathSelectors.any()代表不过滤任何路径
                .paths(PathSelectors.any()) // 默认会扫描所有路径
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("engineerping", "https://github.com/engineerping/gulimall-do", "gongchengship@163.com");
        return new ApiInfo(
                "gulimall-product",
                "gulimall-product",
                "1.0",
                "https://github.com/engineerping/gulimall-do",
                contact,
                "Apache-2.0",
                "https://opensource.org/licenses/Apache-2.0",
                new ArrayList<>()
        );
    }
}
