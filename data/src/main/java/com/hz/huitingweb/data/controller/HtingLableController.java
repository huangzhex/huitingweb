package com.hz.huitingweb.data.controller;

import com.hz.huitingweb.common.model.Result;
import com.hz.huitingweb.data.base.ResultGenerator;
import com.hz.huitingweb.common.model.HtingLable;
import com.hz.huitingweb.data.service.HtingLableService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by huangzhe on 2018/01/16.
*/
@RestController
@RequestMapping("/hting/lable")
public class HtingLableController {
    @Resource
    private HtingLableService htingLableService;

    @PostMapping
    public Result add(@RequestBody HtingLable htingLable) {
        htingLableService.save(htingLable);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        htingLableService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody HtingLable htingLable) {
        htingLableService.update(htingLable);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        HtingLable htingLable = htingLableService.findById(id);
        return ResultGenerator.genSuccessResult(htingLable);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<HtingLable> list = htingLableService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
