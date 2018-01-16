package com.hz.huitingweb.common.model;

import com.hz.huitingweb.common.base.BaseBean;

import javax.persistence.*;

@Table(name = "hting_itemlable")
public class HtingItemLable extends BaseBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 小说
     */
    @Column(name = "item_id")
    private Integer itemId;

    /**
     * 标签
     */
    @Column(name = "lable_id")
    private Integer lableId;

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
     * 获取小说
     *
     * @return item_id - 小说
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置小说
     *
     * @param itemId 小说
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取标签
     *
     * @return lable_id - 标签
     */
    public Integer getLableId() {
        return lableId;
    }

    /**
     * 设置标签
     *
     * @param lableId 标签
     */
    public void setLableId(Integer lableId) {
        this.lableId = lableId;
    }
}