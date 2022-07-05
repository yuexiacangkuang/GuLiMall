package com.yuexia.gulimall.order.dao;

import com.yuexia.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 22:00:35
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
