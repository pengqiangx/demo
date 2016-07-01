package com.github.pengqiangx.demo.dp.prototype.one;

/**
 * 个人订单
 */
public class PersonalOrder implements OrderApi{
    //订购人姓名
    private String customerName;
    //产品编码
    private String productId;
    //订单产品数量
    private int orderProductNum= 0;

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

    public int getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
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
