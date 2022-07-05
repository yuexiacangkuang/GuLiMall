package com.yuexia.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuexia.common.utils.PageUtils;
import com.yuexia.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 21:05:23
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

