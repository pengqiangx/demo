package com.github.pengqiangx.demo.dp.observer.push;

/**
 * 观察者接口
 * 比如,报纸的读者
 */
public interface Observer {
    /**
     * 被通知的方法,直接把报纸的内容推送过来
     * @param content 报纸的内容
     */
    public void update(String content);
}
