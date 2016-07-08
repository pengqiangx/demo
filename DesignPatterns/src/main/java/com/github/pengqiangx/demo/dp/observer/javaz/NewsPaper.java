package com.github.pengqiangx.demo.dp.observer.javaz;

import java.util.Observable;

/**
 * 报纸对象
 * 具体的目标实现
 */
public class NewsPaper extends Observable {

    //报纸具体内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //注意在用Java中的Observer模式的时候,下面这句话不可少
        this.setChanged();

        //然后主动通知,这里用的是推的方式
        this.notifyObservers(this.content);

        //这里用的是拉的方式
        //this.notifyObservers();

    }
}
