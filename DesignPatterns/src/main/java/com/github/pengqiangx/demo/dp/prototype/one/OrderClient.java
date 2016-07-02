package com.github.pengqiangx.demo.dp.prototype.one;

/**
 * 测试
 */
public class OrderClient {
    public static void main(String[] args){
        PersonalOrder op = new PersonalOrder();
        op.setOrderProductNum(3987);
        op.setCustomerName("zhangsan");
        op.setProductId("P00001");

        OrderBusiness ob = new OrderBusiness();
        ob.saveOrder(op);
    }
    /**
     * 这样做这个需求存在的问题
     * 看起来，上面的实现好像也能通用的进行订单处理，而不需要关心订单的类型和具体实现这样的功能。
     * 事实上，在实现订单处理的时候，上面的实现是按照订单的类型和具体实现来处理的，就是instanceof的那一段代码，这样的实现有何不可吗？
     * 这样实现有以下几个问题：
     * - 既然想要实现通用的订单处理，那么对于订单处理的实现对象，是不应该知道订单的具体实现的，更不应该依赖订单的具体实现。但上面代码中，很明显订单处理的对象依赖了订单的具体实现对象。
     * - 这种实现方式会造成另一个问题：难以扩展新的订单类型。假如再要加入一个大型客户的专用订单类型，那就要修改订单处理类了。
     */
}
