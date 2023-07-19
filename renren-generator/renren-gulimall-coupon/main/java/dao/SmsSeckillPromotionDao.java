package ${package}.${moduleName}.dao;

import ${package}.${moduleName}.entity.SmsSeckillPromotionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动
 * 
 * @author ${author}
 * @email ${email}
 * @date 2023-07-20 01:12:57
 */
@Mapper
public interface SmsSeckillPromotionDao extends BaseMapper<SmsSeckillPromotionEntity> {
	
}
