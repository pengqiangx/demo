package com.github.pengqiangx.demo.dp.bridge.two;

/**
 * 定义实现部分的接口
 * 实现发送消息的统一接口
 */
public interface MessageImplementor {
    /**
     * 发送消息
     */
    public void send(String message,String toUser);
}
