package com.hz.huitingweb.common.service.impl;

import com.hz.huitingweb.common.dao.HtingItemLableMapper;
import com.hz.huitingweb.common.model.HtingItemLable;
import com.hz.huitingweb.common.service.HtingItemLableService;
import com.hz.huitingweb.common.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingItemLableServiceImpl extends AbstractService<HtingItemLable> implements HtingItemLableService {
    @Resource
    private HtingItemLableMapper htingItemlableMapper;

}
