package com.yuexia.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuexia.common.utils.PageUtils;
import com.yuexia.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 21:05:23
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

