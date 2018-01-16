package com.hz.huitingweb.common.service.impl;

import com.hz.huitingweb.common.dao.HtingYunPathMapper;
import com.hz.huitingweb.common.model.HtingYunPath;
import com.hz.huitingweb.common.service.HtingYunPathService;
import com.hz.huitingweb.common.base.AbstractService;
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
