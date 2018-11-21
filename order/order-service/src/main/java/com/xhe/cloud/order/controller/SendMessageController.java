package com.xhe.cloud.order.controller;

import com.xhe.cloud.order.message.StreamClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Date;

/**
 * @Auther: Xhe
 * @Date: 2018/11/18 15:41
 * @Description:
 */
@Slf4j
@RestController
public class SendMessageController {

    @Resource
    private StreamClient streamClient;

    @GetMapping("/sendMessage")
    public void process(){
        log.info("client:{}",streamClient);
        streamClient.output().send(MessageBuilder.withPayload("now"+new Date()).build());
    }
}
