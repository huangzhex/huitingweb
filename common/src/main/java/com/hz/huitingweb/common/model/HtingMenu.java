package com.hz.huitingweb.common.model;

import com.hz.huitingweb.common.base.BaseBean;

import javax.persistence.*;

@Table(name = "hting_menu")
public class HtingMenu extends BaseBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String url;

    /**
     * left:左侧菜单 right:右侧菜单 info1:栏目一级 info2:二级栏目
     */
    private String align;

    /**
     * 父类
     */
    @Column(name = "parent_id")
    private Integer parentId;

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
     * 获取left:左侧菜单 right:右侧菜单 info1:栏目一级 info2:二级栏目
     *
     * @return float - left:左侧菜单 right:右侧菜单 info1:栏目一级 info2:二级栏目
     */
    public String getAlign() {
        return align;
    }

    /**
     * 设置left:左侧菜单 right:右侧菜单 info1:栏目一级 info2:二级栏目
     *
     * @param align left:左侧菜单 right:右侧菜单 info1:栏目一级 info2:二级栏目
     */
    public void setAlign(String align) {
        this.align = align;
    }

    /**
     * 获取父类
     *
     * @return parent_id - 父类
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父类
     *
     * @param parentId 父类
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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