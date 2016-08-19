package com.github.pengqiangx.demo.dp.observer.two;

/**
 * 具体的水质监测对象
 */
public class WaterQuality extends WaterQualitySubject {
    /**
     * 污染级别
     * 0:正常
     * 1:轻度污染
     * 2:中度污染
     * 3:高度污染
     */
    private int polluteLevel = 0;
    public void notifyWatchers() {
        for(WatcherObserver watcher : observers){
            if(this.polluteLevel >= 0 && "监测人员".equals(watcher.getJob())){
                watcher.update(this);
            }
            if(this.polluteLevel >= 1 && "预警人员".equals(watcher.getJob())){
                watcher.update(this);
            }
            if(this.polluteLevel >= 2 && "监测部门领导".equals(watcher.getJob())){
                watcher.update(this);
            }
        }
    }

    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        this.notifyWatchers();
    }
}
