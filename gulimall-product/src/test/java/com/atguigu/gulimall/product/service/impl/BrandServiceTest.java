package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandServiceTest {

    @Autowired
    BrandService brandService = new BrandServiceImpl();
    @Test
    public void testInsert() {
        BrandEntity brandEntity = new BrandEntity();
        //Primary key is auto increment according to the configuration in application.yml id-type: auto
        brandEntity.setName("华为");
        // TODO delete from table
        brandService.save(brandEntity);

        HashMap<String, String> queryParam = new HashMap<>();
        queryParam.put("page", "1");
        queryParam.put("limit", "10");
        PageUtils pageUtils = (PageUtils)brandService.queryPage(new HashMap<>());
        BrandEntity brand = (BrandEntity)pageUtils.getList().get(0);
        brand.getName().equals("华为");
        //  TODO delete the inserted value
    }

}
