package com.xhe.cloud.product.dao;

import com.xhe.cloud.product.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:02
 * @Description:
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
