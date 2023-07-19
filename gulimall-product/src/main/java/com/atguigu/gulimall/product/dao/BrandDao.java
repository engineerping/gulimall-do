package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author engineerping
 * @email gongchengship@163.com
 * @date 2023-07-14 16:40:40
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {

    @Delete("delete from pms_brand;")
    public int deleteAll();

}
