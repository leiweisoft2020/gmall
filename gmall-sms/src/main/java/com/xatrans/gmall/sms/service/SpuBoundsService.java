package com.xatrans.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.sms.entity.SpuBoundsEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品spu积分设置
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:30:38
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

