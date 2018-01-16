package com.hz.huitingweb.common.service.impl;

import com.hz.huitingweb.common.dao.HtingUserMapper;
import com.hz.huitingweb.common.model.HtingUser;
import com.hz.huitingweb.common.service.HtingUserService;
import com.hz.huitingweb.common.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingUserServiceImpl extends AbstractService<HtingUser> implements HtingUserService {
    @Resource
    private HtingUserMapper htingUserMapper;

}
