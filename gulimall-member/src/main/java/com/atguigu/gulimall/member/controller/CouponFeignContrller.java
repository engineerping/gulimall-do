package com.atguigu.gulimall.member.controller;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author gongchengship@163.com
 */
@RestController
@RequestMapping("member/coupon")
public class CouponFeignContrller {

    private final Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    private CouponFeignService couponFeignService;

    @GetMapping("/list")
    public R fetchCouponsOfOneMember()
    {
        logger.info("<call member ...>");
        return couponFeignService.fetchCouponsOfOneMember();
    }
}
