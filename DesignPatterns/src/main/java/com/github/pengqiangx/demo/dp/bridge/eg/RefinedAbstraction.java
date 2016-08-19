package com.github.pengqiangx.demo.dp.bridge.eg;

/**
 * 扩充由Abstraction定义的接口功能
 */
public class RefinedAbstraction extends Abstraction {

    /**
     * 构造方法,传入实现部分的对象
     *
     * @param impl 实现部分的对象
     */
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    /**
     * 示例操作,实现一定的功能
     */
    public void otherOperation() {
        /**
         * 实现一定的功能,可能会使用具体实现部分的实现方式
         * 但是本方法更大的可能是使用Abstraction中定义的方法
         * 通过组合使用Abstraction中定义的方法来完成更多的功能
         */

    }
}
