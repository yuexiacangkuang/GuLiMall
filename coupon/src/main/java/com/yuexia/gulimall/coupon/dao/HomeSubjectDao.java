package com.yuexia.gulimall.coupon.dao;

import com.yuexia.gulimall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 21:05:23
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
