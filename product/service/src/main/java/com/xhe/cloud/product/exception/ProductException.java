package com.xhe.cloud.product.exception;

import com.xhe.cloud.product.enums.ResultEnum;

/**
 * @Auther: Xhe
 * @Date: 2018/11/11 22:06
 * @Description:
 */
public class ProductException extends RuntimeException {
    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
