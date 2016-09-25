package com.github.pengqiangx.demo.dp.proxy.two;

/**
 * 测试
 */
public class Client {
    public static void main(String[] args ){
        OrderApi order = new OrderProxy(new Order("设计模式书籍",100,"张三"));
        order.setOrderNum(123,"李四");
        order.setOrderNum(123,"张三");

        System.out.print(order);
    }
}
