package com.zh.test;

import com.zh.service.EmailSend;
import com.zh.utils.EmailEntity;
import org.junit.Test;

public class TestEmail {

    
    @Test
    public void test(){
        EmailEntity email = new EmailEntity();
        email.setUserName("ds16692197443@163.com");
        email.setPassword("DZJYHAJAUQQLOSIE");
        email.setHost("smtp.163.com");
        email.setPort(25);
        email.setFromAddress("ds16692197443@163.com");
        email.setToAddress("643336324@qq.com");
        email.setSubject("这是一封测试邮件!!!!");
        email.setContext("看看这是什么");
        email.setContextType("text/html;charset=utf-8");
        boolean flag = EmailSend.EmailSendTest(email);
        System.err.println("邮件发送结果=="+flag);

    }
    
}
