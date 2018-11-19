package com.xhe.cloud.order.utils;

import java.util.Random;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 19:31
 * @Description:
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
