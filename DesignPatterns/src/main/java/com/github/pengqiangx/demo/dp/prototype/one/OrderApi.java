package com.github.pengqiangx.demo.dp.prototype.one;

/**
 * 订单的接口
 */
public interface OrderApi {
    /**
     * 获取订单产品数量
     * @return
     */
     int getOrderProductNum();

    /**
     * 设置订单产品数量
     * @param num
     */
     void setOrderProductNum(int num);
}
