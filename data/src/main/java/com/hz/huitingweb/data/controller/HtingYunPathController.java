package com.hz.huitingweb.data.controller;
import com.hz.huitingweb.data.base.Result;
import com.hz.huitingweb.data.base.ResultGenerator;
import com.hz.huitingweb.common.model.HtingYunPath;
import com.hz.huitingweb.data.service.HtingYunPathService;
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
@RequestMapping("/hting/yun/path")
@Api(tags = "云盘地址")
public class HtingYunPathController {
    @Resource
    private HtingYunPathService htingYunPathService;

    @PostMapping("/add")
    public Result add(HtingYunPath htingYunPath) {
        htingYunPathService.save(htingYunPath);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        htingYunPathService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(HtingYunPath htingYunPath) {
        htingYunPathService.update(htingYunPath);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        HtingYunPath htingYunPath = htingYunPathService.findById(id);
        return ResultGenerator.genSuccessResult(htingYunPath);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<HtingYunPath> list = htingYunPathService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
