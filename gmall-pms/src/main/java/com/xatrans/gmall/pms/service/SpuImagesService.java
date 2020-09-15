package com.xatrans.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.pms.entity.SpuImagesEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu图片
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 11:40:57
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

