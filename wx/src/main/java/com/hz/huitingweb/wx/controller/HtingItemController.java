package com.hz.huitingweb.wx.controller;

import com.github.pagehelper.PageInfo;
import com.hz.huitingweb.common.model.ListPage;
import com.hz.huitingweb.common.model.Result;
import com.hz.huitingweb.wx.service.HtingItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangzhe on 2018/1/16.
 */
@RestController
public class HtingItemController {
    @Autowired
    private HtingItemService itemService;

    @GetMapping("/items/{page}")
    public Result<PageInfo> getList(@PathVariable("page") Integer page) {
        return itemService.list(page);
    }
}
