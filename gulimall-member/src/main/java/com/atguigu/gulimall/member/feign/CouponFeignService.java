package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon") //这里声明该接口是一个 Feign客户端，参数填入注册中心中的一个 spring.application.name，用于声明将会通过网络去调用注册中心里的那一个远程服务
public interface CouponFeignService { //虽然这个类名叫做 xxxService，但它所提供的服务仅仅是接收一个请求，然后自己再通过网络去请求外部服务获取所需的数据
    @RequestMapping("/coupon/coupon/member/list") //括号里要写 URL 的全路径
    public R fetchCouponsOfOneMember();
}
