package com.hz.huitingweb.data.service.impl;

import com.hz.huitingweb.common.model.HtingLable;
import com.hz.huitingweb.common.base.AbstractService;
import com.hz.huitingweb.data.dao.HtingLableMapper;
import com.hz.huitingweb.data.service.HtingLableService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingLableServiceImpl extends AbstractService<HtingLable> implements HtingLableService {
    @Resource
    private HtingLableMapper htingLableMapper;

}
