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
    String INPUT = "messageInput";
    String OUTPUT = "messageOutPut";

    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Output(StreamClient.OUTPUT)
    MessageChannel output();
}
