package com.hz.huitingweb.data.controller;

import com.hz.huitingweb.common.model.Result;
import com.hz.huitingweb.data.base.ResultGenerator;
import com.hz.huitingweb.common.model.HtingYunPath;
import com.hz.huitingweb.data.service.HtingYunPathService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by huangzhe on 2018/01/16.
*/
@RestController
@RequestMapping("/hting/yun/path")
public class HtingYunPathController {
    @Resource
    private HtingYunPathService htingYunPathService;

    @PostMapping
    public Result add(@RequestBody HtingYunPath htingYunPath) {
        htingYunPathService.save(htingYunPath);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        htingYunPathService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody HtingYunPath htingYunPath) {
        htingYunPathService.update(htingYunPath);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        HtingYunPath htingYunPath = htingYunPathService.findById(id);
        return ResultGenerator.genSuccessResult(htingYunPath);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<HtingYunPath> list = htingYunPathService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
