package com.hz.huitingweb.wx.entity;

import java.util.List;

/**
 * Created by huangzhe on 2018/1/17.
 */
public class NewsMessage extends BaseWechatMessage {
    private int articleCount;//图文消息个数，限制为8条以内

    private List<Article> Articles;// 多条图文消息信息，默认第一个item为大图

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    public List<Article> getArticles() {
        return Articles;
    }

    public void setArticles(List<Article> articles) {
        Articles = articles;
    }
}
