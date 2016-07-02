package com.github.pengqiangx.demo.dp.prototype.one.refactor;

/**
 * 订单处理类
 */
public class OrderBusiness {

    public void saveOrder(OrderApi order){
        while(order.getOrderProductNum() > 1000){
            //创建一份订单（通用写法,可以不再用instanceof了）
            OrderApi newOrder = order.clone();
            newOrder.setOrderProductNum(1000);

            //原来的订单保留,把数量设置减少1000
            order.setOrderProductNum(order.getOrderProductNum() - 1000);
            System.out.println("拆分订单="+newOrder);
        }
        //不超过的部分,直接业务处理
        System.out.print("订单="+order);
    }
}
