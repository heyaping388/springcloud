package com.xhe.cloud.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: Xhe
 * @Date: 2018/11/18 15:38
 * @Description:
 */
@Slf4j
@Component
@EnableBinding(StreamClient.class)
public class StreamReceiver {

    @StreamListener(StreamClient.INPUT)
    public void process(Object message){
        log.info("message:{}",message);
    }
}
