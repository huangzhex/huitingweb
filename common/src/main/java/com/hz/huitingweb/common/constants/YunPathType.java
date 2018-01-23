package com.hz.huitingweb.common.constants;

/**
 * Created by huangzhe on 2018/1/17.
 */
public enum YunPathType {
    page("page"),//页面
    image("image");//图片

    private String code;
    private YunPathType(String code){
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
