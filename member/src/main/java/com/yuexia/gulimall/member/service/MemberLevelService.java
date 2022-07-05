package com.yuexia.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuexia.common.utils.PageUtils;
import com.yuexia.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 21:49:42
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

