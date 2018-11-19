package com.xhe.cloud.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Auther: Xhe
 * @Date: 2018/11/18 15:37
 * @Description:
 */
public interface StreamClient {
    String INPUT = "myMessage";
    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Output(StreamClient.INPUT)
    MessageChannel output();
}
