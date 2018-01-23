package com.hz.huitingweb.wx.entity;

/**
 * Created by huangzhe on 2018/1/17.
 */
public class TextMessage extends BaseWechatMessage {
    /**
     * 文本消息内容
     */
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
