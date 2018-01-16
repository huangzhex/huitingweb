package com.hz.huitingweb.common.service.impl;

import com.hz.huitingweb.common.dao.HtingWxUserMapper;
import com.hz.huitingweb.common.model.HtingWxUser;
import com.hz.huitingweb.common.service.HtingWxUserService;
import com.hz.huitingweb.common.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingWxUserServiceImpl extends AbstractService<HtingWxUser> implements HtingWxUserService {
    @Resource
    private HtingWxUserMapper huitingWxUserMapper;

}
