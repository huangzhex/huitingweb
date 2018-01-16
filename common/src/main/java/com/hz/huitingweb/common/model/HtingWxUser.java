package com.hz.huitingweb.common.model;

import com.hz.huitingweb.common.base.BaseBean;

import javax.persistence.*;

@Table(name = "huiting_wx_user")
public class HtingWxUser extends BaseBean {
    /**
     * 微信用户id
     */
    @Column(name = "weixin_id")
    private String weixinId;

    /**
     * 获取微信用户id
     *
     * @return weixin_id - 微信用户id
     */
    public String getWeixinId() {
        return weixinId;
    }

    /**
     * 设置微信用户id
     *
     * @param weixinId 微信用户id
     */
    public void setWeixinId(String weixinId) {
        this.weixinId = weixinId;
    }
}