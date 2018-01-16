package com.hz.huitingweb.data.controller;
import com.hz.huitingweb.data.base.Result;
import com.hz.huitingweb.data.base.ResultGenerator;
import com.hz.huitingweb.common.model.HtingMsg;
import com.hz.huitingweb.data.service.HtingMsgService;
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
@RequestMapping("/hting/msg")
@Api(tags = "消息")
public class HtingMsgController {
    @Resource
    private HtingMsgService htingMsgService;

    @PostMapping("/add")
    public Result add(HtingMsg htingMsg) {
        htingMsgService.save(htingMsg);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        htingMsgService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(HtingMsg htingMsg) {
        htingMsgService.update(htingMsg);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        HtingMsg htingMsg = htingMsgService.findById(id);
        return ResultGenerator.genSuccessResult(htingMsg);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<HtingMsg> list = htingMsgService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
