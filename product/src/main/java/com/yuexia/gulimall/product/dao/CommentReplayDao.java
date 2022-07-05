package com.yuexia.gulimall.product.dao;

import com.yuexia.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 17:25:48
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
