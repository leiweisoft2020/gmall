package com.xatrans.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.ums.entity.MemberCollectSpuEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员收藏的商品
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:17:26
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

