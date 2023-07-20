package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author engineerping
 * @email gongchengship@163.com
 * @date 2023-07-20 12:13:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
