package com.xhe.cloud.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: Xhe
 * @Date: 2018/11/11 22:02
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {

    private String productId;

    private Integer productQuantity;
}
