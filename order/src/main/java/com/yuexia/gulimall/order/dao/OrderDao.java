package com.yuexia.gulimall.order.dao;

import com.yuexia.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 22:00:35
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
