package com.github.pengqiangx.demo.dp.observer.javaz;



/**
 * test
 */
public class Client {
    public static void main(String[] args){
        //创建一个报纸,作为观察者
        NewsPaper subject = new NewsPaper();
        //创建一个阅读者（也就是观察者）
        Reader r = new Reader();
        r.setName("张三");

        Reader r2 = new Reader();
        r2.setName("李四");

        Reader r3 = new Reader();
        r3.setName("王五");

        subject.addObserver(r);
        subject.addObserver(r2);
        subject.addObserver(r3);

        //要出报纸啦啦
        subject.setContent("本期报纸的内容:javaz实现观察者模式");

    }
}
