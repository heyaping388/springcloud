package com.xhe.cloud.order.controller;

import com.xhe.cloud.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Xhe
 * @Date: 2018/11/17 21:39
 * @Description:
 */
@RefreshScope
@RestController
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/girl/print")
    public String print(){
        System.out.println(girlConfig.getName());
        return "name:" +girlConfig.getName() + "age:" + girlConfig.getAge();
    }
}
