package com.github.pengqiangx.demo.dp.proxy.two;

/**
 *  现在有一个订单系统，要求是：一旦订单被创建，只有订单的创建人才可以修改订单中的数据，其他人则不能修改。
 *
 *   相当于现在如果有了一个订单对象实例，那么就需要控制外部对它的访问，满足条件的可以访问，不满足条件的就不能访问。
 */
public interface OrderApi {

    public String getProductName();

    public void setProductName(String productName,String user);

    //获取订单订购的数量
    public  int getOrderNum();

    public void setOrderNum(int orderNum , String user);

    /**
     * 获取创建订单的人员
     * @return 创建订单人员
     */
    public String getOrderUser();

    public void setOrderUser(String orderUser ,String user);

}
