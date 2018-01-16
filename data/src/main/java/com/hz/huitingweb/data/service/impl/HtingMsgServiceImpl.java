package com.hz.huitingweb.data.service.impl;

import com.hz.huitingweb.common.model.HtingMsg;
import com.hz.huitingweb.data.base.AbstractService;
import com.hz.huitingweb.data.dao.HtingMsgMapper;
import com.hz.huitingweb.data.service.HtingMsgService;
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
