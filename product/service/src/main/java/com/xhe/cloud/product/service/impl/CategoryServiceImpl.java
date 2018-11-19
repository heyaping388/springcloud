package com.xhe.cloud.product.service.impl;

import com.xhe.cloud.product.dao.ProductCategoryDao;
import com.xhe.cloud.product.entity.ProductCategory;
import com.xhe.cloud.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:15
 * @Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }
}
