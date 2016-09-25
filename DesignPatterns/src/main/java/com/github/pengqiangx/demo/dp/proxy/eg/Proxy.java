package com.github.pengqiangx.demo.dp.proxy.eg;

/**
 * 代理对象
 */

public class Proxy implements Subject {

    //持有被代理的具体的目标对象
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        //在转调具体的目标对象前,可以执行一些功能处理

        //转调具体的目标对象的方法
        realSubject.request();

        //转调后,可以执行的一些功能处理
    }
}
