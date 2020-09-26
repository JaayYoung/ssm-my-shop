package com.funtl.my.shop.web.admin.web.controller;

import com.funtl.my.shop.web.admin.entity.TbItem;
import com.funtl.my.shop.web.admin.service.TbItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 商品表(TbItem)表控制层
 *
 * @author makejava
 * @since 2020-09-26 09:35:46
 */
@RestController
@RequestMapping("tbItem")
public class TbItemController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemService tbItemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbItem selectOne(Long id) {
        return this.tbItemService.queryById(id);
    }

}