package com.hz.huitingweb.data.service.impl;

import com.hz.huitingweb.common.model.HtingItemSet;
import com.hz.huitingweb.data.base.AbstractService;
import com.hz.huitingweb.data.dao.HtingItemSetMapper;
import com.hz.huitingweb.data.service.HtingItemSetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingItemSetServiceImpl extends AbstractService<HtingItemSet> implements HtingItemSetService {
    @Resource
    private HtingItemSetMapper htingItemSetMapper;

}
