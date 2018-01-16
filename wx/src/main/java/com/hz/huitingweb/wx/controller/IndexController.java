package com.hz.huitingweb.wx.controller;

import com.hz.huitingweb.common.model.HtingMenu;
import com.hz.huitingweb.common.service.HtingMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by huangzhe on 2018/1/16.
 */
@RestController
@RequestMapping("/wx")
public class IndexController {

    @Autowired
    private HtingMenuService htingMenuService;

    @GetMapping("/")
    @ResponseBody
    public List<HtingMenu> index() {
        return htingMenuService.findAll();
    }
}
