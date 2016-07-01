package com.github.pengqiangx.demo.dp.prototype.one;

/**
 * 处理订单的业务对象
 */
public class OrderBusiness {
    /**
     * 创建订单的方法
     * @param order
     * 当订单的预订产品数量超过1000的时候,就需要把订单拆成2份订单
     */
    public void saveOrder(OrderApi order){
        //判断当前的预订产品数量是否大于1000
       while(order.getOrderProductNum() > 1000){
           //如果大于,则,还需要继续拆分
           OrderApi newOrder = null;
           if(order instanceof  PersonalOrder){
               PersonalOrder p2 = new PersonalOrder();
               PersonalOrder p1 = (PersonalOrder)  order;
               p2.setCustomerName(p1.getCustomerName());
               p2.setProductId(p1.getProductId());
               p2.setOrderProductNum(1000);
               newOrder = p2;
           }else if(order instanceof  EnterpriseOrder){
               EnterpriseOrder e2 = new EnterpriseOrder();
               EnterpriseOrder e1 = new EnterpriseOrder();
               e2.setEnterpriseName(e1.getEnterpriseName());
               e2.setProductId(e1.getProductId());
               e2.setOrderProductNum(1000);
               newOrder = e2;
           }
           //原来的订单保留,但需要把数量设置减少1000
           order.setOrderProductNum(order.getOrderProductNum() - 1000);
           System.out.println("拆分生产的订单:"+newOrder);
       }

        // 不超过1000的,就直接业务功能处理
        System.out.println("订单:" + order);

    }
}
