package com.github.pengqiangx.demo.dp.prototype.one.refactor;

import org.junit.Test;

/**
 * 测试
 */
public class TestDemo {
    @Test
    public void test1(){
        //先创建原型实例
        OrderApi order = new PersonalOrder();
        order.setOrderProductNum(100);
        System.out.println(order.getOrderProductNum());

        // 通过克隆来获取新的实例
        OrderApi order2 = (OrderApi) order.clone();
        order2.setOrderProductNum(80);
        System.out.println(order2.getOrderProductNum());

        //再次输出原型实例的值
        System.out.println("再次输出原型实例="+ order.getOrderProductNum());

    }
    @Test
    public void test2(){
        PersonalOrder order = new PersonalOrder();
        order.setOrderProductNum(3987);
        order.setCustomerName("zhangsan");
        order.setProductId("P0001");

        OrderBusiness business = new OrderBusiness();
        business.saveOrder(order);
    }
}
