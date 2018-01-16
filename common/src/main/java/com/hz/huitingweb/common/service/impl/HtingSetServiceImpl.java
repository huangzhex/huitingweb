package com.hz.huitingweb.common.service.impl;

import com.hz.huitingweb.common.dao.HtingSetMapper;
import com.hz.huitingweb.common.model.HtingSet;
import com.hz.huitingweb.common.service.HtingSetService;
import com.hz.huitingweb.common.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingSetServiceImpl extends AbstractService<HtingSet> implements HtingSetService {
    @Resource
    private HtingSetMapper htingSetMapper;

}
