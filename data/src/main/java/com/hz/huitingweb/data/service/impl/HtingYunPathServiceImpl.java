package com.hz.huitingweb.data.service.impl;

import com.hz.huitingweb.common.model.HtingYunPath;
import com.hz.huitingweb.data.base.AbstractService;
import com.hz.huitingweb.data.dao.HtingYunPathMapper;
import com.hz.huitingweb.data.service.HtingYunPathService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingYunPathServiceImpl extends AbstractService<HtingYunPath> implements HtingYunPathService {
    @Resource
    private HtingYunPathMapper htingYunPathMapper;

}
