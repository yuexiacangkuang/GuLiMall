package com.yuexia.gulimall.member.dao;

import com.yuexia.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 21:49:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
