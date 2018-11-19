package com.xhe.cloud.product.dao;

import com.xhe.cloud.product.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:04
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = productCategoryDao.findByCategoryTypeIn(Arrays.asList(11, 12));
        Assert.assertTrue(list.size() > 0);
    }
}