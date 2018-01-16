package com.hz.huitingweb.common.model;

import javax.persistence.*;

@Table(name = "hting_yun_path")
public class HtingYunPath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 文件名
     */
    @Column(name = "file_name")
    private String fileName;

    /**
     * 父类
     */
    private Integer pid;

    /**
     * 是否展开
     */
    private String open;

    /**
     * 连接
     */
    private String url;

    /**
     * 打开方式
     */
    private String target;

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
     * 获取文件名
     *
     * @return file_name - 文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置文件名
     *
     * @param fileName 文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取父类
     *
     * @return pid - 父类
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置父类
     *
     * @param pid 父类
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取是否展开
     *
     * @return open - 是否展开
     */
    public String getOpen() {
        return open;
    }

    /**
     * 设置是否展开
     *
     * @param open 是否展开
     */
    public void setOpen(String open) {
        this.open = open;
    }

    /**
     * 获取连接
     *
     * @return url - 连接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置连接
     *
     * @param url 连接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取打开方式
     *
     * @return target - 打开方式
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置打开方式
     *
     * @param target 打开方式
     */
    public void setTarget(String target) {
        this.target = target;
    }
}