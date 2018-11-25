package com.github.pengqiangx.demo.javacore.base;

/**
 * @author xiaoniu 2018/11/2.
 */
public class B extends A {

    public static void getName(){
        System.out.println("hello B");
    }

    @Override
    public void getName2(){
        //super.getName2();
        System.out.println("hello B2");
    }
}
