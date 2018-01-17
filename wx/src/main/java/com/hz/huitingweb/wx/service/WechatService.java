package com.hz.huitingweb.wx.service;

import com.hz.huitingweb.common.util.StringUtils;
import com.hz.huitingweb.wx.entity.Article;
import com.hz.huitingweb.wx.entity.NewsMessage;
import com.hz.huitingweb.wx.entity.TextMessage;
import com.hz.huitingweb.wx.util.WechatMessageUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by huangzhe on 2018/1/17.
 */
@Service
public class WechatService {
    private static Logger log = Logger.getLogger(WechatService.class);

    public String processRequest(HttpServletRequest request) {
        Map<String, String> map = WechatMessageUtil.xmlToMap(request);
        log.info(map);
        // 发送方帐号（一个OpenID）
        String fromUserName = map.get("FromUserName");
        // 开发者微信号
        String toUserName = map.get("ToUserName");
        // 消息类型
        String msgType = map.get("MsgType");
        // 默认回复一个"success"
        String responseMessage = "success";
        // 对消息进行处理
        if (WechatMessageUtil.MESSAGE_TEXT.equals(msgType)) {// 文本消息
            String content=map.get("Content");//内容
            responseMessage = createCmd(fromUserName,toUserName,content);
        } else if(WechatMessageUtil.MESSAtGE_IMAGE.equals(msgType)) {//图片
            String picUrl=map.get("PicUrl");//图片链接
            String mediaId=map.get("MediaId");//图片消息媒体id
            responseMessage = createTextMessage(fromUserName,toUserName,"已接收图");
        } else if(WechatMessageUtil.MESSAGE_EVENT.equals(msgType)) {//推送
            String event=map.get("Event");//事件 subscribe(订阅)、unsubscribe(取消订阅)
            if(StringUtils.isNotEmpty(event)){
                if(event.equals("subscribe")){
                    //订阅
                    //TODO:添加用户
                    responseMessage=createTextMessage(fromUserName,toUserName,getMainMenu());
                }else{
                    //取消订阅
                    //TODO:删除用户
                }
            }
        }
        log.info(responseMessage);
        return responseMessage;
    }

    /**
     * 通过文字判断
     * @param fromUserName
     * @param toUserName
     * @param content
     * @return
     */
    private String createCmd(String fromUserName, String toUserName, String content){
        if(StringUtils.isNotEmpty(content)){
            if(content.equals("h")||  content.equals("help")) {
                return createTextMessage(fromUserName, toUserName, getMainMenu());
            }else{
                return createTextMessage(fromUserName,toUserName,content);
            }
        }else{
            return createTextMessage(fromUserName,toUserName,getMainMenu());
        }
    }

    /**
     * 生成文本消息
     * @param fromUserName
     * @param toUserName
     * @param content
     * @return
     */
    private String createTextMessage(String fromUserName, String toUserName, String content){
        TextMessage textMessage = new TextMessage();
        textMessage.setMsgType(WechatMessageUtil.MESSAGE_TEXT);
        textMessage.setToUserName(fromUserName);
        textMessage.setFromUserName(toUserName);
        textMessage.setCreateTime(System.currentTimeMillis());
        textMessage.setContent(content);
        return WechatMessageUtil.textMessageToXml(textMessage);
    }

    /**
     * 图文消息
     * @param fromUserName
     * @param toUserName
     * @param articles
     * @return
     */
    private String createNewsMessage(String fromUserName, String toUserName,List<Article> articles){
        NewsMessage newsMessage = new NewsMessage();
        newsMessage.setToUserName(fromUserName);
        newsMessage.setFromUserName(toUserName);
        newsMessage.setCreateTime(System.currentTimeMillis());
        newsMessage.setMsgType(WechatMessageUtil.MESSAGE_NEWS);
        newsMessage.setArticleCount(articles.size());
        newsMessage.setArticles(articles);
        return WechatMessageUtil.newsMessageToXml(newsMessage);
    }

    /**
     * 得到主菜单
     * @return
     */
    private String getMainMenu() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("您好，我是(●—●)，请回复数字选择服务：").append("\n\n");
        buffer.append("1  我的博客").append("\n");
        buffer.append("2  公交查询").append("\n");
        buffer.append("3  周边搜索").append("\n");
        buffer.append("4  歌曲点播").append("\n");
        buffer.append("5  经典游戏").append("\n");
        buffer.append("回复“0”显示此帮助菜单");
        return buffer.toString();
    }
}
