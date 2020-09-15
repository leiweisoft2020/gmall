package com.xatrans.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.oms.entity.PaymentInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:28:00
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

