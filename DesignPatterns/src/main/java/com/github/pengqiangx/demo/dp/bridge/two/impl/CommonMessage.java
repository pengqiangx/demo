package com.github.pengqiangx.demo.dp.bridge.two.impl;

import com.github.pengqiangx.demo.dp.bridge.two.AbstractMessage;
import com.github.pengqiangx.demo.dp.bridge.two.MessageImplementor;

/**
 * 普通消息的实现
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message,String toUser){
        /**
         * 对于普通消息,什么都不干,直接调用父类的方法,把消息发送出去就可以了
         */
        super.sendMessage(message,toUser);
    }
}
