package com.github.pengqiangx.demo.dp.observer.two;

/**
 * client test
 */
public class Client {
    public static void main(String[] args){
        //创建水质主题对象
        WaterQuality subject = new WaterQuality();
        //创建3个观察者
        WatcherObserver w1 = new Watcher();
        w1.setJob("监测人员");
        WatcherObserver w2 = new Watcher();
        w2.setJob("预警人员");
        WatcherObserver w3 = new Watcher();
        w3.setJob("监测部门领导");
        //注册观察者
        subject.attach(w1);
        subject.attach(w2);
        subject.attach(w3);
        System.out.println("当前水质为正常的时候---------");
        subject.setPolluteLevel(0);
        System.out.println("当前水质为轻度污染的时候---------");
        subject.setPolluteLevel(1);
        System.out.println("当前水质为中度污染的时候----------");
        subject.setPolluteLevel(2);
    }
}
