package com.hz.huitingweb.data.service.impl;

import com.hz.huitingweb.common.model.HtingUser;
import com.hz.huitingweb.common.base.AbstractService;
import com.hz.huitingweb.data.dao.HtingUserMapper;
import com.hz.huitingweb.data.service.HtingUserService;
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
