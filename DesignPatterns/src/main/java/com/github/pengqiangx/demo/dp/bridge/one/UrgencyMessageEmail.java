package com.github.pengqiangx.demo.dp.bridge.one;

/**
 * E-mail加急消息
 */
public class UrgencyMessageEmail implements UrgencyMessage{
    @Override
    public void send(String message, String toUser) {
        message = "加急:"+message;
        System.out.println("使用E-mail的方式,发送消息("+message+")给"+toUser);
    }
    @Override
    public Object watch(String messageId) {
        //获取相应的数据,组织成监控的数据对象,然后返回
        return null;
    }
}
