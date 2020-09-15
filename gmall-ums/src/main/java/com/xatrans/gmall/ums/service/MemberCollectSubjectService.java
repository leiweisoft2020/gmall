package com.xatrans.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xatrans.gmall.ums.entity.MemberCollectSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员收藏的专题活动
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:17:26
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

