package com.github.pengqiangx.demo.dp.observer.push;

/**
 * 真正的读者
 * 具体观察者对象
 */
public class Reader implements Observer {
    //读者姓名
    private String name;
    //采用推模式,直接推送报纸内容
    public void update(String content) {
        //直接接收传入的数据就行
        System.out.println(name+"收到报纸了,请阅读它,内容是:"+content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
