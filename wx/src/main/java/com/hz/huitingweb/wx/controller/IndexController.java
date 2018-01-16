package com.hz.huitingweb.wx.controller;

import com.hz.huitingweb.common.model.HtingMenu;
import org.springframework.beans.factory.annotation.Autowired;
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


    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "";
    }
}
