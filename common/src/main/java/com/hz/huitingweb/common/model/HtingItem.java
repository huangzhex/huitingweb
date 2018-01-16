package com.hz.huitingweb.common.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hting_item")
public class HtingItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 作者
     */
    private String author;

    /**
     * 演播
     */
    private String reader;

    /**
     * 百度下载地址
     */
    @Column(name = "baidu_url")
    private String baiduUrl;

    /**
     * 图片链接
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 是否主页显示 1为显示
     */
    @Column(name = "home_show")
    private Integer homeShow;

    /**
     * 排序
     */
    @Column(name = "order_index")
    private Integer orderIndex;

    /**
     * 菜单显示对应的菜单
     */
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 菜单排序
     */
    @Column(name = "menu_order_index")
    private Integer menuOrderIndex;

    /**
     * 添加时间
     */
    private Date createtime;

    /**
     * 云盘密码
     */
    private String pwd;

    /**
     * 下载网站链接
     */
    private String weburl;

    /**
     * 是否完结
     */
    private String isend;

    /**
     * 共多少集
     */
    private Integer scount;

    /**
     * 分类ID
     */
    @Column(name = "lable_id")
    private Integer lableId;

    /**
     * 简介
     */
    private String context;

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
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取演播
     *
     * @return reader - 演播
     */
    public String getReader() {
        return reader;
    }

    /**
     * 设置演播
     *
     * @param reader 演播
     */
    public void setReader(String reader) {
        this.reader = reader;
    }

    /**
     * 获取百度下载地址
     *
     * @return baidu_url - 百度下载地址
     */
    public String getBaiduUrl() {
        return baiduUrl;
    }

    /**
     * 设置百度下载地址
     *
     * @param baiduUrl 百度下载地址
     */
    public void setBaiduUrl(String baiduUrl) {
        this.baiduUrl = baiduUrl;
    }

    /**
     * 获取图片链接
     *
     * @return img_url - 图片链接
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片链接
     *
     * @param imgUrl 图片链接
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取是否主页显示 1为显示
     *
     * @return home_show - 是否主页显示 1为显示
     */
    public Integer getHomeShow() {
        return homeShow;
    }

    /**
     * 设置是否主页显示 1为显示
     *
     * @param homeShow 是否主页显示 1为显示
     */
    public void setHomeShow(Integer homeShow) {
        this.homeShow = homeShow;
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

    /**
     * 获取菜单显示对应的菜单
     *
     * @return menu_id - 菜单显示对应的菜单
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单显示对应的菜单
     *
     * @param menuId 菜单显示对应的菜单
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取菜单排序
     *
     * @return menu_order_index - 菜单排序
     */
    public Integer getMenuOrderIndex() {
        return menuOrderIndex;
    }

    /**
     * 设置菜单排序
     *
     * @param menuOrderIndex 菜单排序
     */
    public void setMenuOrderIndex(Integer menuOrderIndex) {
        this.menuOrderIndex = menuOrderIndex;
    }

    /**
     * 获取添加时间
     *
     * @return createtime - 添加时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置添加时间
     *
     * @param createtime 添加时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取云盘密码
     *
     * @return pwd - 云盘密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置云盘密码
     *
     * @param pwd 云盘密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取下载网站链接
     *
     * @return weburl - 下载网站链接
     */
    public String getWeburl() {
        return weburl;
    }

    /**
     * 设置下载网站链接
     *
     * @param weburl 下载网站链接
     */
    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    /**
     * 获取是否完结
     *
     * @return isend - 是否完结
     */
    public String getIsend() {
        return isend;
    }

    /**
     * 设置是否完结
     *
     * @param isend 是否完结
     */
    public void setIsend(String isend) {
        this.isend = isend;
    }

    /**
     * 获取共多少集
     *
     * @return scount - 共多少集
     */
    public Integer getScount() {
        return scount;
    }

    /**
     * 设置共多少集
     *
     * @param scount 共多少集
     */
    public void setScount(Integer scount) {
        this.scount = scount;
    }

    /**
     * 获取分类ID
     *
     * @return lable_id - 分类ID
     */
    public Integer getLableId() {
        return lableId;
    }

    /**
     * 设置分类ID
     *
     * @param lableId 分类ID
     */
    public void setLableId(Integer lableId) {
        this.lableId = lableId;
    }

    /**
     * 获取简介
     *
     * @return context - 简介
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置简介
     *
     * @param context 简介
     */
    public void setContext(String context) {
        this.context = context;
    }
}