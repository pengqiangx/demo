package com.github.pengqiangx.demo.dp.observer.two;

/**
 * Created by pengqiang on 16/7/30.
 */
public class Watcher implements WatcherObserver {
    //职务
    private String job;

    public void update(WaterQualitySubject subject) {
        System.out.println(job+"获取到通知,当前污染级别为:"+subject.getPolluteLevel());
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
