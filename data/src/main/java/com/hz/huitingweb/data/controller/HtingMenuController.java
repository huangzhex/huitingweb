package com.hz.huitingweb.data.controller;

import com.hz.huitingweb.common.model.Result;
import com.hz.huitingweb.data.base.ResultGenerator;
import com.hz.huitingweb.common.model.HtingMenu;
import com.hz.huitingweb.data.service.HtingMenuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by huangzhe on 2018/01/16.
*/
@RestController
@RequestMapping("/hting/menu")
public class HtingMenuController {
    @Resource
    private HtingMenuService htingMenuService;

    @PostMapping
    public Result add(@RequestBody HtingMenu htingMenu) {
        htingMenuService.save(htingMenu);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        htingMenuService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody HtingMenu htingMenu) {
        htingMenuService.update(htingMenu);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        HtingMenu htingMenu = htingMenuService.findById(id);
        return ResultGenerator.genSuccessResult(htingMenu);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<HtingMenu> list = htingMenuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
