package com.github.pengqiangx.demo.dp.observer.two;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义水质检测的目标对象
 */
public abstract class WaterQualitySubject {
    //用来保存注册的观察者对象
    protected List<WatcherObserver> observers = new ArrayList<WatcherObserver>();
    //注册观察者对象
    public void attach(WatcherObserver observer) {
        observers.add(observer);
    }
    //删除观察者对象
    public void detach(WatcherObserver observer){
        observers.remove(observer);
    }
    //通知相应的观察者对象
    public abstract void notifyWatchers();
    //获取水质污染的级别
    public abstract int getPolluteLevel();
}
