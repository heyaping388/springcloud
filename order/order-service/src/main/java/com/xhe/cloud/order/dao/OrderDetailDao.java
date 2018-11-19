package com.xhe.cloud.order.dao;

import com.xhe.cloud.order.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 19:10
 * @Description:
 */
public interface OrderDetailDao extends JpaRepository<OrderDetail,String> {
}
