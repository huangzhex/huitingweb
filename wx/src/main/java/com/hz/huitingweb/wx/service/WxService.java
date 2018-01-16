package com.hz.huitingweb.wx.service;

import com.hz.huitingweb.wx.configuration.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huangzhe on 2018/1/17.
 */
@FeignClient(name = "wx-host",url = "https://api.weixin.qq.com/cgi-bin",configuration = FeignConfiguration.class)
public interface WxService {
    @RequestMapping(value = "/token",method = RequestMethod.GET)
    String token(@RequestParam(value = "grant_type",defaultValue = "client_credential") String grantType,
                 @RequestParam("appid") String appid,
                 @RequestParam("secret") String secret);
}
