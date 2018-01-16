package com.hz.huitingweb.common.model;

/**
 * 分页查询实体
 * Created by huangzhe on 2018/1/16.
 */
public class ListPage {
    private Integer page;
    private Integer size=10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
