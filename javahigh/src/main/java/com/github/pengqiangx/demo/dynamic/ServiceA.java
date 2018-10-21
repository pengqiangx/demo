package com.github.pengqiangx.demo.dynamic;

/**
 * @author xiaoniu 2018/10/20.
 */
public class ServiceA {

    @SimpleInject
    ServiceB b;

    public void callB(String param){
        b.action(param);
    }

    public ServiceB getB() {
        return b;
    }
}
