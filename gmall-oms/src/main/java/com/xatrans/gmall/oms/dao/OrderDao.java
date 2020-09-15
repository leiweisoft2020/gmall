package com.xatrans.gmall.oms.dao;

import com.xatrans.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:28:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
