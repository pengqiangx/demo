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
     */
}
