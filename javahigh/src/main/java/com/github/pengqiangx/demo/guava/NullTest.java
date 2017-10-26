package com.github.pengqiangx.demo.guava;

import com.google.common.base.Optional;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by pengqiang on 2017/10/15.
 */
public class NullTest {
    @Test
    public void def(){
        int age = 0;
        System.out.println("age="+age);
        long money;
        money = 10L;
        System.out.println("money="+money);
        //String name;
        String name = null;
        System.out.println("name="+name);
    }

    @Test
    public void test2(){
        if (null instanceof java.lang.Object) {
            System.out.println("null属于java.lang.Object类型");
        } else {
            System.out.println("null不属于java.lang.Object类型");
        }
    }
    @Test
    public void testOptional() throws Exception {
        Optional<Integer> possible=Optional.of(6);
        if(possible.isPresent()){
            System.out.println("possible isPresent:"+possible.isPresent());
            System.out.println("possible value:"+possible.get());
        }
    }

    @Test(expected = NullPointerException.class)
    public void optional1(){
        Optional<Integer> unpossible = Optional.of(null);
    }

    @Test
    public void optional2(){
        Optional<Integer> optional = Optional.of(1);
        Assert.assertTrue(optional.isPresent());
        Assert.assertTrue(1==optional.get());
        //构造可以为null的Optional
        Optional<Integer> possible = Optional.fromNullable(null);
        Assert.assertFalse(possible.isPresent());

    }
}
