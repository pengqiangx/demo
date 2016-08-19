package com.github.pengqiangx.demo.dp.flyweight.one.unshare;


import java.util.HashMap;
import java.util.Map;

/**
 * 定义好了享元,来看看如何管理这些享元。
 * 享元工厂 ,通常实现称为单例
 * 享元工厂负责享元对象的创建和管理,基本思路就是在享元工厂中缓存享元对象。
 * 在java中最常用的缓存实现方式,就是定义一个Map来存费缓存的数据
 */
public class FlyweightFactory {
    private static FlyweightFactory factory = new FlyweightFactory();
    private FlyweightFactory(){

    }
    public static FlyweightFactory getInstance(){
        return factory;
    }

    //缓存多个Flyweight对象
    private Map<String, Flyweight> fwsMap = new HashMap<String, Flyweight>();

    /**
     *  获取key对应的享元对象
     * @param key 享元对象的key
     * @return
     */
    public  Flyweight getFlyweight(String key){
        //先去缓存中查找,是否存在key对应的Flyweight对象
        Flyweight f = fwsMap.get(key);
        /**
         * A.如果存在,就返回相对应的Flyweight对象
         * B.如果不存在,就创建享元对象,并且添加到缓存中
         */
        if(f == null){
            f = new AuthorizationFlyweight(key);
            fwsMap.put(key,f);
        }
        return f;
    }
}
