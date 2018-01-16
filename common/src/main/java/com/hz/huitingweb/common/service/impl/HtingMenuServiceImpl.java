package com.hz.huitingweb.common.service.impl;

import com.hz.huitingweb.common.dao.HtingMenuMapper;
import com.hz.huitingweb.common.model.HtingMenu;
import com.hz.huitingweb.common.service.HtingMenuService;
import com.hz.huitingweb.common.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingMenuServiceImpl extends AbstractService<HtingMenu> implements HtingMenuService {
    @Resource
    private HtingMenuMapper htingMenuMapper;

}
