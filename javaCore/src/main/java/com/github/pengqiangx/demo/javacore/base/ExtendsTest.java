package com.github.pengqiangx.demo.javacore.base;

import org.junit.Test;

/**
 * @author xiaoniu 2018/11/7.
 */
public class ExtendsTest {
    @Test
    public void test1(){
        B.getName();
    }

    @Test
    public void test2(){
        B b = new B();
        b.getName2();
    }
}
