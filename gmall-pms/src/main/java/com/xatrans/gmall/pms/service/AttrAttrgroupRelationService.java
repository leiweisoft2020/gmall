package com.xatrans.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性&属性分组关联
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 11:40:57
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

