package com.github.pengqiangx.demo.dp.observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象
 * 它知道观察它的观察者,并提供注册和删除观察者的接口
 */
public class Subject {
    /**
     * 用来保存注册的观察者对象（报纸的订阅者）
     */
    private List<Observer> readers = new ArrayList<Observer>();

    /**
     * 报纸的读者需要向报社订阅,先要注册
     * @param reader  报纸的读者
     */
    public void attach(Observer reader){
        readers.add(reader);
    }
    /**
     * 报纸的读者可以取消订阅
     *  @param reader 报纸的读者
     */
    public void detach(Observer reader){
        readers.remove(reader);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers(){
        for (Observer reader : readers){
            reader.update(this);
        }
    }
}
