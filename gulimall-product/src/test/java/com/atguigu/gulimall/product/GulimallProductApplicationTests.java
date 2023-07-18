package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
        Assert.assertTrue(true);
    }

}
