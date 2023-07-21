package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.member.entity.MemberEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CouponFeignServiceTest {
    @Autowired
    private CouponFeignService couponFeignService;

    @Test
    public void fetchCouponsOfOneMember(){
        R r = couponFeignService.fetchCouponsOfOneMember();
        //R类是 HashMap<String, Object>的子类
        //这里的R中的数据来自于 gulimall-coupon 服务中的 R.ok().put("coupons", Arrays.asList(couponEntity));：
        Object result = r.get("coupons");
        System.out.println("获取到的优惠券是：" + result);
    }

}
