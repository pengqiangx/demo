package com.github.pengqiangx.demo.dp.prototype.one.eg;

/**
 * 克隆的具体实现对象
 */
public class ConcretePrototype2 implements Prototype {

    public Prototype clone() {
        //最简单的克隆,新建一个自身对象
        Prototype prototype = new ConcretePrototype2();
        return prototype;
    }
}
