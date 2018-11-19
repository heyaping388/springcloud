package com.xhe.cloud.order.controller;

import com.xhe.cloud.common.DecreaseStockInput;
import com.xhe.cloud.common.ProductInfoOutput;
import com.xhe.cloud.product.client.ProductClient;
import com.xhe.cloud.order.dto.CartDTO;
import com.xhe.cloud.order.entity.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;


@Slf4j
@RestController
public class ClientController {

    /*@Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getProductMsg")
    public String getProductMsg(){
        String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);
        log.info("response {}",response);
        return response;
    }*/


    @Resource
    private ProductClient productClient;

    /*@GetMapping("/getProductMsg")
    public String getProductMsg(){
        String response = productClient.msg();
        log.info("response={}",response);
        return response;
    }*/

    @GetMapping("/getProductList")
    public String getProductList(){
        List<ProductInfoOutput> response = productClient.listForOrder(Arrays.asList("157875196366160022", "157875227953464068"));
        log.info("response={}",response);
        return "ok";
    }


    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock(){
        productClient.decreaseStock(Arrays.asList(new DecreaseStockInput("157875196366160022",2)));
        return "ok";
    }
}
