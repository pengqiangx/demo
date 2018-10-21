package com.github.pengqiangx.demo.dynamic;

/**
 * @author xiaoniu 2018/10/20.
 */
public class ServiceB {

    public String  action(String username){
        System.out.println("I'm B - param = " + username);
        return "hello " + username;
    }
}
