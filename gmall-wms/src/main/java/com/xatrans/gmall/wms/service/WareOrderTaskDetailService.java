package com.xatrans.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.wms.entity.WareOrderTaskDetailEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:33:39
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageVo queryPage(QueryCondition params);
}

