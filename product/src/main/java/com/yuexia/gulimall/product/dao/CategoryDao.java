package com.yuexia.gulimall.product.dao;

import com.yuexia.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 17:25:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
