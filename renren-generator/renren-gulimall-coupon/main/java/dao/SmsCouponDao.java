package ${package}.${moduleName}.dao;

import ${package}.${moduleName}.entity.SmsCouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ${author}
 * @email ${email}
 * @date 2023-07-20 01:12:57
 */
@Mapper
public interface SmsCouponDao extends BaseMapper<SmsCouponEntity> {
	
}
