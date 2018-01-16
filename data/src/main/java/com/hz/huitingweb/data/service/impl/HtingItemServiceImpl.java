package com.hz.huitingweb.data.service.impl;

import com.hz.huitingweb.common.model.HtingItem;
import com.hz.huitingweb.data.base.AbstractService;
import com.hz.huitingweb.data.dao.HtingItemMapper;
import com.hz.huitingweb.data.service.HtingItemService;
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
