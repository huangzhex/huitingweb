package com.hz.huitingweb.common.model;

import com.hz.huitingweb.common.base.BaseBean;

import javax.persistence.*;

@Table(name = "hting_lable")
public class HtingLable extends BaseBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String url;

    @Column(name = "info_id")
    private Integer infoId;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return info_id
     */
    public Integer getInfoId() {
        return infoId;
    }

    /**
     * @param infoId
     */
    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    /**
     * @return order_index
     */
    public Integer getOrderIndex() {
        return orderIndex;
    }

    /**
     * @param orderIndex
     */
    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }
}