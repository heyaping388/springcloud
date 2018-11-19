package com.xhe.cloud.product.service;

import com.xhe.cloud.product.entity.ProductCategory;

import java.util.List;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:14
 * @Description:
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
