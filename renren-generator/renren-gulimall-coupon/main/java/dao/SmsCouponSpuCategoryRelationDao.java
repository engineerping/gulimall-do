package ${package}.${moduleName}.dao;

import ${package}.${moduleName}.entity.SmsCouponSpuCategoryRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券分类关联
 * 
 * @author ${author}
 * @email ${email}
 * @date 2023-07-20 01:12:57
 */
@Mapper
public interface SmsCouponSpuCategoryRelationDao extends BaseMapper<SmsCouponSpuCategoryRelationEntity> {
	
}
