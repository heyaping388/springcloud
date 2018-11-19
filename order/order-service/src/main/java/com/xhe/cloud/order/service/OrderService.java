package com.xhe.cloud.order.service;

import com.xhe.cloud.order.dto.OrderDTO;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 19:21
 * @Description:
 */
public interface OrderService {
    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
