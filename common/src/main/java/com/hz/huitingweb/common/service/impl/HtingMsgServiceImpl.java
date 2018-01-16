package com.hz.huitingweb.common.service.impl;

import com.hz.huitingweb.common.dao.HtingMsgMapper;
import com.hz.huitingweb.common.model.HtingMsg;
import com.hz.huitingweb.common.service.HtingMsgService;
import com.hz.huitingweb.common.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by huangzhe on 2018/01/16.
 */
@Service
@Transactional
public class HtingMsgServiceImpl extends AbstractService<HtingMsg> implements HtingMsgService {
    @Resource
    private HtingMsgMapper htingMsgMapper;

}
