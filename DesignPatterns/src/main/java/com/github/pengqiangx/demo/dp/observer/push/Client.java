package com.github.pengqiangx.demo.dp.observer.push;

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

        subject.attach(r);
        subject.attach(r2);
        subject.attach(r3);

        //要出报纸啦啦
        subject.setContent("本期报纸的内容:push 推模式");

    }
}
