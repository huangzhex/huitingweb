package com.hz.huitingweb.wx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hz.huitingweb.common.model.HtingYunPath;
import com.hz.huitingweb.data.service.HtingYunPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by huangzhe on 2018/1/16.
 */
@RestController
public class HtingItemController {
    @Autowired
    private HtingYunPathService yunPathService;

    @GetMapping("/yun")
    public PageInfo<HtingYunPath> queryHtingYunPath() {
        PageHelper.startPage(1,10);
        List<HtingYunPath> yunPaths=yunPathService.findAll();
        PageInfo<HtingYunPath> pathPageInfo=new PageInfo<>(yunPaths);
        return pathPageInfo;
    }
}
