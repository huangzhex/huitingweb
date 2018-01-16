package com.hz.huitingweb.data.controller;

import com.hz.huitingweb.common.model.Result;
import com.hz.huitingweb.data.base.ResultGenerator;
import com.hz.huitingweb.common.model.HtingItemSet;
import com.hz.huitingweb.data.service.HtingItemSetService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by huangzhe on 2018/01/16.
*/
@RestController
@RequestMapping("/hting/item/set")
public class HtingItemSetController {
    @Resource
    private HtingItemSetService htingItemSetService;

    @PostMapping
    public Result add(@RequestBody HtingItemSet htingItemSet) {
        htingItemSetService.save(htingItemSet);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        htingItemSetService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody HtingItemSet htingItemSet) {
        htingItemSetService.update(htingItemSet);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        HtingItemSet htingItemSet = htingItemSetService.findById(id);
        return ResultGenerator.genSuccessResult(htingItemSet);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<HtingItemSet> list = htingItemSetService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
