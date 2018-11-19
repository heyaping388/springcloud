package com.xhe.cloud.product.service;

import com.xhe.cloud.product.ProductApplicationTests;
import com.xhe.cloud.product.entity.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:16
 * @Description:
 */
@Slf4j
@Component
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 12));
        log.info("list: {}", list);
        Assert.assertTrue(list.size() > 0);
    }
}