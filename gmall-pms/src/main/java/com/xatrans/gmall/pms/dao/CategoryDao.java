package com.xatrans.gmall.pms.dao;

import com.xatrans.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 11:40:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
