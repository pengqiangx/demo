package com.github.pengqiangx.demo.dp.prototype.one.refactor;

import com.github.pengqiangx.demo.dp.prototype.one.*;

/**
 * 个人订单对象
 */
public class PersonalOrder implements OrderApi {
    private String customerName;
    private String productId;
    private int orderProductNum = 0;
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OrderApi clone() {
        /**
         * 不能直接使用return this,这么做的话,每次克隆,客户端获取的其实都是同一个实例,都是
         * 指向同一个内存空间的,对克隆出来的对象实例的修改会影响到原型对象实例.
         */
        //创建一个新的订单,然后把本实例的数据复制过去
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(this.customerName);
        order.setProductId(this.productId);
        order.setOrderProductNum(this.orderProductNum);
        return order;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "customerName='" + customerName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }
}
