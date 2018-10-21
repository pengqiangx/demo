package com.github.pengqiangx.demo.dynamic;

/**
 * @author xiaoniu 2018/10/21.
 */
public class CGLibContainerDemo {

    public static void main(String[] args) {

        ServiceA a = CGLibContainer.getInstance(ServiceA.class);
        a.callB("pengqiang");
    }

}
