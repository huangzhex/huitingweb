package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.service.ICodeGenerator;

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
        codeGenerator.genController("hting_item","HtingItem");
        codeGenerator.genController("hting_item_set","HtingItemSet");
        codeGenerator.genController("hting_itemlable","HtingItemLable");
        codeGenerator.genController("hting_lable","HtingLable");
        codeGenerator.genController("hting_menu","HtingMenu");
        codeGenerator.genController("hting_msg","HtingMsg");
        codeGenerator.genController("hting_set","HtingSet");
        codeGenerator.genController("hting_user","HtingUser");
        codeGenerator.genController("hting_yun_path","HtingYunPath");
        codeGenerator.genController("huiting_wx_user","HtingWxUser");
    }
}
