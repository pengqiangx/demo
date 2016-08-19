package com.github.pengqiangx.demo.dp.flyweight.eg;

/**
 * 享元对象
 */
public class ConcreteFlyweight implements Flyweight {

    //描述内部状态
    private String intrinsicState;

    public ConcreteFlyweight(String state){
        this.intrinsicState = state;
    }

    public void operation(String extrinsicState) {
        //具体的功能处理,可能会用到享元内部,外部的状态
    }
}
