package com.hz.huitingweb.common.base;

import com.github.pagehelper.PageInfo;
import com.hz.huitingweb.common.base.BaseBean;
import com.hz.huitingweb.common.constants.ResultEnum;
import com.hz.huitingweb.common.model.Result;

/**
 * Created by huangzhe on 2018/1/16.
 */
public class ResultGenerator {
    public static Result genSuccessResult() {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS);
        return result;
    }

    public static <T extends BaseBean> Result genSuccessResult(T bean) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS);
        result.setData(bean);
        return result;
    }

    public static Result genSuccessResult(PageInfo pageInfo) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS);
        result.setData(pageInfo);
        return result;
    }
}
