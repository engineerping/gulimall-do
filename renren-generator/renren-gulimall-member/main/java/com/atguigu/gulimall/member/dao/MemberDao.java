package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author engineerping
 * @email gongchengship@163.com
 * @date 2023-07-20 11:42:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
