package com.hz.huitingweb.data.controller;

import com.hz.huitingweb.common.model.Result;
import com.hz.huitingweb.data.base.ResultGenerator;
import com.hz.huitingweb.common.model.HtingSet;
import com.hz.huitingweb.data.service.HtingSetService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by huangzhe on 2018/01/16.
*/
@RestController
@RequestMapping("/hting/set")
public class HtingSetController {
    @Resource
    private HtingSetService htingSetService;

    @PostMapping
    public Result add(@RequestBody HtingSet htingSet) {
        htingSetService.save(htingSet);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        htingSetService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody HtingSet htingSet) {
        htingSetService.update(htingSet);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        HtingSet htingSet = htingSetService.findById(id);
        return ResultGenerator.genSuccessResult(htingSet);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<HtingSet> list = htingSetService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
