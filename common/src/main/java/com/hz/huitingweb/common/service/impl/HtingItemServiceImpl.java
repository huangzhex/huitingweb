package com.hz.huitingweb.common.service.impl;

import com.hz.huitingweb.common.dao.HtingItemMapper;
import com.hz.huitingweb.common.model.HtingItem;
import com.hz.huitingweb.common.service.HtingItemService;
import com.hz.huitingweb.common.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingItemServiceImpl extends AbstractService<HtingItem> implements HtingItemService {
    @Resource
    private HtingItemMapper htingItemMapper;

}
