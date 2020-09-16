package com.xatrans.gmall.pms.vo;


import com.xatrans.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.xatrans.gmall.pms.entity.AttrEntity;
import com.xatrans.gmall.pms.entity.AttrGroupEntity;
import io.swagger.annotations.ApiModel;
import jdk.nashorn.internal.ir.LiteralNode;
import lombok.Data;

import java.util.List;

@Data
public class GroupVo extends AttrGroupEntity {

    private List<AttrEntity> attrEntities;
    private List<AttrAttrgroupRelationEntity> relations;

}
