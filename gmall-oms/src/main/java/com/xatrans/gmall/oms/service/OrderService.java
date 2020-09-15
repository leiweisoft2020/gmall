package com.xatrans.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.oms.entity.OrderEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:28:01
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

