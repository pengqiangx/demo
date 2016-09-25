package com.github.pengqiangx.demo.dp.proxy.two.dynamic;

/**
 * Created by pengqiang on 16/9/23.
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order("设计模式书籍",100,"张三");
        //创建一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy();
        //然后把订单和动态代理关联起来
        OrderApi orderApi = dynamicProxy.getProxyInterface(order);

        orderApi.setOrderNum(123,"李四");
        System.out.println(order);
        orderApi.setOrderNum(123,"张三");
        System.out.println(order);
    }
}
