package com.xatrans.gmall.wms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.xatrans.gmall.wms.entity.PurchaseEntity;
import com.xatrans.gmall.wms.service.PurchaseService;




/**
 * 采购信息
 *
 * @author leiwei
 * @email 38334429@qq.com
 * @date 2020-09-15 13:33:39
 */
@Api(tags = "采购信息 管理")
@RestController
@RequestMapping("wms/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('wms:purchase:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = purchaseService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('wms:purchase:info')")
    public Resp<PurchaseEntity> info(@PathVariable("id") Long id){
		PurchaseEntity purchase = purchaseService.getById(id);

        return Resp.ok(purchase);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('wms:purchase:save')")
    public Resp<Object> save(@RequestBody PurchaseEntity purchase){
		purchaseService.save(purchase);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('wms:purchase:update')")
    public Resp<Object> update(@RequestBody PurchaseEntity purchase){
		purchaseService.updateById(purchase);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('wms:purchase:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		purchaseService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
