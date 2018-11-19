package com.xhe.cloud.order.dao;

import com.xhe.cloud.order.OrderApplicationTests;
import com.xhe.cloud.order.entity.OrderMaster;
import com.xhe.cloud.order.enums.OrderStatusEnum;
import com.xhe.cloud.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


/**
 * @Auther: Xhe
 * @Date: 2018/11/10 19:11
 * @Description:
 */
@Component
public class OrderMasterDaoTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterDao orderMasterDao;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("xhe");
        orderMaster.setBuyerPhone("1886131241241");
        orderMaster.setBuyerAddress("长沙市");
        orderMaster.setBuyerOpenid("1101110");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster result = orderMasterDao.save(orderMaster);
        Assert.assertTrue(result != null);
    }
}