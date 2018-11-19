package com.xhe.cloud.product.vo;

import lombok.Data;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:19
 * @Description:
 */
@Data
public class ResultVo<T> {
    private Integer code;
    private String msg;
    private T data;
}
