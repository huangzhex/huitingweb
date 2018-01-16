package com.hz.huitingweb.data.controller;
import com.hz.huitingweb.data.base.Result;
import com.hz.huitingweb.data.base.ResultGenerator;
import com.hz.huitingweb.common.model.HtingItemSet;
import com.hz.huitingweb.data.service.HtingItemSetService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by huangzhe on 2018/01/16.
*/
@RestController
@RequestMapping("/hting/item/set")
@Api(tags = "标题设置")
public class HtingItemSetController {
    @Resource
    private HtingItemSetService htingItemSetService;

    @PostMapping("/add")
    public Result add(HtingItemSet htingItemSet) {
        htingItemSetService.save(htingItemSet);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        htingItemSetService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(HtingItemSet htingItemSet) {
        htingItemSetService.update(htingItemSet);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        HtingItemSet htingItemSet = htingItemSetService.findById(id);
        return ResultGenerator.genSuccessResult(htingItemSet);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<HtingItemSet> list = htingItemSetService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
