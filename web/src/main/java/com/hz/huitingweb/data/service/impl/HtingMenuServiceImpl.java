package com.hz.huitingweb.data.service.impl;

import com.hz.huitingweb.common.model.HtingMenu;
import com.hz.huitingweb.common.base.AbstractService;
import com.hz.huitingweb.data.dao.HtingMenuMapper;
import com.hz.huitingweb.data.service.HtingMenuService;
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
