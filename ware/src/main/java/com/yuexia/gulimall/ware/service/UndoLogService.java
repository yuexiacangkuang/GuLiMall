package com.yuexia.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuexia.common.utils.PageUtils;
import com.yuexia.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yuexia
 * @email againstfate@foxmail.com
 * @date 2022-07-04 22:06:58
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

