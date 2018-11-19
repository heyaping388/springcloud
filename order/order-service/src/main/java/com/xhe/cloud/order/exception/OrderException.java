package com.xhe.cloud.order.exception;

import com.xhe.cloud.order.enums.ResultEnum;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 19:43
 * @Description:
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
