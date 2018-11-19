package com.xhe.cloud.order.dao;

import com.xhe.cloud.order.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: Xhe
 * @Date: 2018/11/10 19:09
 * @Description:
 */
public interface OrderMasterDao extends JpaRepository<OrderMaster,String> {
}
