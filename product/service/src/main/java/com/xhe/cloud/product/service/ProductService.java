package com.xhe.cloud.product.service;

import com.xhe.cloud.product.dto.CartDTO;
import com.xhe.cloud.product.entity.ProductInfo;

import java.util.List;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:06
 * @Description:
 */
public interface ProductService {
    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    List<ProductInfo> findList(List<String> productIdList);

    void decreaseStock(List<CartDTO> cartDTOList);
}
