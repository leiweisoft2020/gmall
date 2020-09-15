package com.xatrans.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.pms.entity.CommentReplayEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品评价回复关系
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 11:40:57
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVo queryPage(QueryCondition params);
}

