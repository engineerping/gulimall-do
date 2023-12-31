package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.dao.BrandDao;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandServiceTest {

    @Autowired
    BrandService brandService;

    @Autowired
    BrandDao brandDao;
    @Test
    public void testInsert() {
        BrandEntity brandEntity = new BrandEntity();
        //Primary key is auto increment according to the configuration in application.yml id-type: auto
        brandEntity.setName("华为");
        //delete from table
        brandDao.deleteAll();
        brandService.save(brandEntity);

        // List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "华为"));
        // list.forEach(System.out::println);
        HashMap<String, Object> queryParam = new HashMap<>();
        queryParam.put("page", "1");
        queryParam.put("limit", "10");
        PageUtils pageUtils = (PageUtils)brandService.queryPage(queryParam);
        BrandEntity brand = (BrandEntity)pageUtils.getList().get(0);
        brand.getName().equals("华为");
        //delete the inserted value
        brandDao.delete(new Wrapper<BrandEntity>() {
            @Override
            public BrandEntity getEntity() {
                BrandEntity brandEntity = new BrandEntity();
                brandEntity.setName("华为");
                return brandEntity;
            }

            @Override
            public MergeSegments getExpression() {
                return null;
            }

            @Override
            public String getSqlSegment() {
                return null;
            }
        });
    }

}
