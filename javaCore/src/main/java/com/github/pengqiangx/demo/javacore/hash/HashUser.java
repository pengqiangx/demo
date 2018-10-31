package com.github.pengqiangx.demo.javacore.hash;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoniu 2018/8/8.
 */
public class HashUser {

    private String name;

    private int age;

    public HashUser() {
    }

    public HashUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Test
    public void test1(){
        Map<HashUser, String> map = new HashMap<>(4);
        map.put(new HashUser("hello"), "hello");
        String hello = map.get(new HashUser("hello"));
        System.out.println(hello);
    }

}
