package com.xatrans.gmall.pms.vo;


import com.xatrans.gmall.pms.entity.AttrEntity;
import com.xatrans.gmall.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

@Data
public class AttrAndGroupEntity extends AttrGroupEntity {
    private List<AttrEntity> attrEntities;
}
