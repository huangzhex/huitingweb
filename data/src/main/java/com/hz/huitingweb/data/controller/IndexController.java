package com.hz.huitingweb.data.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by huangzhe on 2018/1/16.
 */
@Controller
public class IndexController {
    /**
     * 接口
     *
     * @return 接口
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiIgnore()
    public ModelAndView index() {
        return new ModelAndView("redirect:/swagger-ui.html");
    }
}
