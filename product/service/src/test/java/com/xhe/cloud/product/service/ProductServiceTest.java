package com.xhe.cloud.product.service;

import com.xhe.cloud.product.ProductApplicationTests;
import com.xhe.cloud.product.dto.CartDTO;
import com.xhe.cloud.product.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 18:11
 * @Description:
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() throws Exception {
        CartDTO cartDTO = new CartDTO("164103465734242707", 2);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }
}