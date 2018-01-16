package com.hz.huitingweb.common.model;

import com.hz.huitingweb.common.base.BaseBean;

import javax.persistence.*;

@Table(name = "hting_set")
public class HtingSet extends BaseBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String name;

    /**
     * url
     */
    private String url;

    /**
     * 类型 img 和 text
     */
    private String type;

    /**
     * 排序
     */
    @Column(name = "order_index")
    private Integer orderIndex;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标题
     *
     * @return name - 标题
     */
    public String getName() {
        return name;
    }

    /**
     * 设置标题
     *
     * @param name 标题
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取url
     *
     * @return url - url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url
     *
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取类型 img 和 text
     *
     * @return type - 类型 img 和 text
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型 img 和 text
     *
     * @param type 类型 img 和 text
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取排序
     *
     * @return order_index - 排序
     */
    public Integer getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设置排序
     *
     * @param orderIndex 排序
     */
    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }
}