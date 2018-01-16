package com.hz.huitingweb.common.model;

import com.hz.huitingweb.common.base.BaseBean;

import javax.persistence.*;

@Table(name = "hting_item_set")
public class HtingItemSet extends BaseBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 小说ID
     */
    @Column(name = "item_id")
    private Integer itemId;

    /**
     * 集数
     */
    @Column(name = "index_no")
    private Integer indexNo;

    /**
     * 下载地址
     */
    @Column(name = "down_url")
    private String downUrl;

    /**
     * 小标题
     */
    private String title;

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
     * 获取小说ID
     *
     * @return item_id - 小说ID
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置小说ID
     *
     * @param itemId 小说ID
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取集数
     *
     * @return index_no - 集数
     */
    public Integer getIndexNo() {
        return indexNo;
    }

    /**
     * 设置集数
     *
     * @param indexNo 集数
     */
    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    /**
     * 获取下载地址
     *
     * @return down_url - 下载地址
     */
    public String getDownUrl() {
        return downUrl;
    }

    /**
     * 设置下载地址
     *
     * @param downUrl 下载地址
     */
    public void setDownUrl(String downUrl) {
        this.downUrl = downUrl;
    }

    /**
     * 获取小标题
     *
     * @return title - 小标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置小标题
     *
     * @param title 小标题
     */
    public void setTitle(String title) {
        this.title = title;
    }
}