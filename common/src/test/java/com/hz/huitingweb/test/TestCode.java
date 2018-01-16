package com.hz.huitingweb.test;

import com.hz.huitingweb.test.service.ICodeGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huangzhe on 2017/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TbiTestApplication.class)
public class TestCode {
    @Autowired
    ICodeGenerator codeGenerator;
    @Test
    public void createCode(){
//        codeGenerator.genCode("hting_item","HtingItem");
//        codeGenerator.genCode("hting_item_set","HtingItemSet");
//        codeGenerator.genCode("hting_itemlable","HtingItemLable");
//        codeGenerator.genCode("hting_lable","HtingLable");
//        codeGenerator.genCode("hting_menu","HtingMenu");
//        codeGenerator.genCode("hting_msg","HtingMsg");
//        codeGenerator.genCode("hting_set","HtingSet");
//        codeGenerator.genCode("hting_user","HtingUser");
//        codeGenerator.genCode("hting_yun_path","HtingYunPath");
//        codeGenerator.genCode("huiting_wx_user","HtingWxUser");
    }
}
