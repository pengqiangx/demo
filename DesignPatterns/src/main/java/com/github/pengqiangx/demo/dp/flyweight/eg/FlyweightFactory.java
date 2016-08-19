package com.github.pengqiangx.demo.dp.flyweight.eg;

import java.util.HashMap;
import java.util.Map;

/**
 * 在享元模式中,客户端不能直接创建共享的享元对象实例,必须通过享元工厂来创建。
 * 享元工程
 */
public class FlyweightFactory {
    //缓存多个Flyweight对象
    private Map<String,Flyweight> fwsMap = new HashMap<String, Flyweight>();

    /**
     *  获取key对应的享元对象
     * @param key 享元对象的key
     * @return
     */
    public Flyweight getFlyweight(String key){
        //先去缓存中查找,是否存在key对应的Flyweight对象
        Flyweight f = fwsMap.get(key);
        /**
         * A.如果存在,就返回相对应的Flyweight对象
         * B.如果不存在,就创建享元对象,并且添加到缓存中
         */
        if(f == null){
            f = new ConcreteFlyweight(key);
            fwsMap.put(key,f);
        }
        return f;
    }
}
