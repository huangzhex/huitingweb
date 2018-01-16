package com.hz.huitingweb.wx.service;

import com.github.pagehelper.PageInfo;
import com.hz.huitingweb.common.model.ListPage;
import com.hz.huitingweb.common.model.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huangzhe on 2018/1/16.
 */
@FeignClient(name = "huitingweb-data", url = "http://localhost:801")
public interface HtingItemService {
    @RequestMapping(value = "/hting/item", method = RequestMethod.GET)
    Result<PageInfo> list(@RequestParam("page") Integer page);
}
