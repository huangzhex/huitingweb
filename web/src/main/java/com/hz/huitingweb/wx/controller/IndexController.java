package com.hz.huitingweb.wx.controller;

import com.hz.huitingweb.wx.service.CosService;
import com.hz.huitingweb.wx.service.WechatService;
import com.hz.huitingweb.wx.service.WxService;
import com.hz.huitingweb.wx.util.WxUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

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
    @Autowired
    private WechatService wechatService;
    @Autowired
    private CosService cosService;

    @GetMapping("/")
    @ResponseBody
    public Object index() {
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

    @PostMapping("/wx")
    @ResponseBody
    public void wxMsg(HttpServletRequest request, HttpServletResponse response){
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out=response.getWriter();
            String responseMessage = wechatService.processRequest(request);
            out.print(responseMessage);
            out.flush();
        }catch (Exception ex){
            logger.error(ex.getMessage(),ex);
        }
    }

//    @GetMapping("/save")
//    @ResponseBody
//    public String saveUrl() throws Exception {
//        return cosService.updateImageUrl("http://www.itcast.cn/subject/czly/images/box3_img3.png");
//    }



}
