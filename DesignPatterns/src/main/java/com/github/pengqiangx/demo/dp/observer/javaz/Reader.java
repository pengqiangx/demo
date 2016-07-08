package com.github.pengqiangx.demo.dp.observer.javaz;

import java.util.Observable;
import java.util.Observer;

/**
 * 真正的读者
 * Observer的接口是Java提供的
 */
public class Reader implements Observer {
    //读者姓名
    private String name;

    public void update(Observable subject, Object o) {
        /**
         * 采用的是推的方式
         * 注意:目标实现类里面调用的必须是推的方式,否则这里的Object o 参数会为null
         */
        System.out.println(name + "收到报纸,阅读它;目标推送过来的内容:"+o);

        /**
         * 拉模型
         * 对于要用拉的方式获取数据,在目标实现里面怎么调用都行,有参无参数都行
         * java默认会传递目标的实现对象本身,也就是说,Java实现观察者模式时默认是拉模型,
         * 如果你用推模型调用,那么两种方式都可以获取到值,也就是两种方式可以同时使用.
         */
        System.out.println(name+"收到报纸,主动到目标对象去拉的内容="+((NewsPaper)subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
