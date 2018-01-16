package com.hz.huitingweb.wx.controller;

import com.hz.huitingweb.common.model.HtingMenu;
import com.hz.huitingweb.common.util.Digests;
import com.hz.huitingweb.common.util.SHA1;
import com.hz.huitingweb.wx.service.WxService;
import com.hz.huitingweb.wx.util.WxUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by huangzhe on 2018/1/16.
 */
@RestController
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Value("${wx.token}")
    private String wxToken;
    @Value("${wx.appid}")
    private String appid;
    @Value("${wx.secret}")
    private String secret;

    @Autowired
    private WxService wxService;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "";
    }

    @GetMapping("/wx")
    public String wxToken(@RequestParam(value = "signature") String signature,
                          @RequestParam(value = "timestamp") String timestamp,
                          @RequestParam(value = "nonce") String nonce,
                          @RequestParam(value = "echostr") String echostr) {
        logger.debug("signature:" + signature);
        logger.debug("timestamp:" + timestamp);
        logger.debug("nonce:" + nonce);
        logger.debug("echostr:" + echostr);
        if (WxUtil.checkSignature(wxToken, signature, timestamp, nonce)) {
            logger.debug("验证通过!");
            return echostr;
        }
        return "error";
    }

    @GetMapping("/wx/token")
    @ResponseBody
    public String token() {
        return wxService.token("client_credential", appid, secret);
    }
}
