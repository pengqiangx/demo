package com.github.pengqiangx.demo.dp.observer.pull;

/**
 * 真正的读者
 * 具体观察者对象
 */
public class Reader implements Observer {
    //读者姓名
    private String name;
    //拉模式
    public void update(Subject subject) {
        //具体的更新实现
        String c = ((NewsPaper)subject).getContent();
        System.out.println(name+"收到报纸了,请阅读它,内容是:"+c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
