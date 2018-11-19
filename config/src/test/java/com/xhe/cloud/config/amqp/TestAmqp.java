package com.xhe.cloud.config.amqp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: Xhe
 * @Date: 2018/11/18 12:11
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAmqp {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test1(){
        rabbitTemplate.convertSendAndReceive("test","hello");
    }
}
