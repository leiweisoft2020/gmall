package com.xatrans.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.sms.entity.HomeSubjectSpuEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 专题商品
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:30:38
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

