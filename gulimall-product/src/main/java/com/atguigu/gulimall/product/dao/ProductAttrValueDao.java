package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.ProductAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu属性值
 * 
 * @author engineerping
 * @email gongchengship@163.com
 * @date 2023-07-14 16:40:40
 *
 * #Tell Mybatis that where the object-table-mapping files (mapper.xml) are.
 * # 使用了@org.apache.ibatis.annotations.Mapper注解之后,就不需要mapper-locations配置了。mapper.xml已经备份成了 zip 包，
 * # 原 mapper.xml文件已删除
 */
@Mapper
public interface ProductAttrValueDao extends BaseMapper<ProductAttrValueEntity> {
	
}
