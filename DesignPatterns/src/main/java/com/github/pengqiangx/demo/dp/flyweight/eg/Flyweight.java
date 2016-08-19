package com.github.pengqiangx.demo.dp.flyweight.eg;

/**
 * 享元接口
 * 通过这个接口享元可以接受并作用于外部状态
 */
public interface Flyweight {
    /**
     * 实例操作,传入外部状态
     * @param  extrinsicState 实例参数 ,外部状态
     */
    void operation(String extrinsicState);
}
