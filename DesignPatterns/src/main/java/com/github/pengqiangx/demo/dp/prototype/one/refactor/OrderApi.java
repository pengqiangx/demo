package com.github.pengqiangx.demo.dp.prototype.one.refactor;

/**
 * 订单接口
 */
public interface OrderApi {
    int getOrderProductNum();
    void setOrderProductNum(int num);
    //强制每个对象去实现自己复制自己的功能
    OrderApi clone();
}
