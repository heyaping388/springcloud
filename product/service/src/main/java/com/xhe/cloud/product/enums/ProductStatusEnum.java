package com.xhe.cloud.product.enums;

import lombok.Getter;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:09
 * @Description:
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
