package com.xatrans.gmall.sms.dao;

import com.xatrans.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:30:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
