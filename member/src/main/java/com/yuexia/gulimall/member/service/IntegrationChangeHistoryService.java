package com.yuexia.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuexia.common.utils.PageUtils;
import com.yuexia.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 21:49:42
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

