package com.xatrans.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.ums.entity.IntegrationChangeHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 积分变化历史记录
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:17:26
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

