package ${package}.${moduleName}.dao;

import ${package}.${moduleName}.entity.SmsSkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author ${author}
 * @email ${email}
 * @date 2023-07-20 01:12:57
 */
@Mapper
public interface SmsSkuLadderDao extends BaseMapper<SmsSkuLadderEntity> {
	
}
