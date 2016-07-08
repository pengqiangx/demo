package com.github.pengqiangx.demo.dp.observer.push;

/**
 * 报纸对象（具体的目标对象)
 * 负责把有关状态存入到相应的观察者对象
 * 并在自己状态发送改变时,通知各个观察者
 */
public class NewsPaper extends Subject {

    //报纸的具体内容
    private String content;

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
        notifyObservers(content);
    }
}
