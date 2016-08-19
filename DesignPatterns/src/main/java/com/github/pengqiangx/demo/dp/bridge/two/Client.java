package com.github.pengqiangx.demo.dp.bridge.two;

import com.github.pengqiangx.demo.dp.bridge.two.impl.CommonMessage;
import com.github.pengqiangx.demo.dp.bridge.two.impl.SpecialUrgencyMessage;
import com.github.pengqiangx.demo.dp.bridge.two.impl.UrgencyMessage;
import com.github.pengqiangx.demo.dp.bridge.two.sendType.MessageMobile;
import com.github.pengqiangx.demo.dp.bridge.two.sendType.MessageSMS;

/**
 * 测试
 */
public class Client {

    public static void main(String[] args){
        //创建具体的消息发送方式
        MessageImplementor impl = new MessageSMS();

        //创建一个普通消息对象
        AbstractMessage m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶","张三");

        //创建一个紧急消息对象
        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","李四");

        //创建一个特急消息对象
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","王五");

        //把实现方式切换成手机短消息,然后再实现一边
        impl = new MessageMobile();
        m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶","张三");

        //创建一个紧急消息对象
        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","李四");

        //创建一个特急消息对象
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","王五");


    }
}
