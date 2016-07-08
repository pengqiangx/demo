package com.github.pengqiangx.demo.dp.observer.eg;

/**
 * 具体观察者对象
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    public void update(Subject subject) {
        //具体的更新实现
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
