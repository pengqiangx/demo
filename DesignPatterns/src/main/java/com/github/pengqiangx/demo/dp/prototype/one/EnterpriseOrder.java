package com.github.pengqiangx.demo.dp.prototype.one;

/**
 * 企业订单
 */
public class EnterpriseOrder implements OrderApi {
    //订购人姓名
    private String enterpriseName;
    //产品编码
    private String productId;
    //订单产品数量
    private int orderProductNum= 0;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
        return "EnterpriseOrder{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }
}
