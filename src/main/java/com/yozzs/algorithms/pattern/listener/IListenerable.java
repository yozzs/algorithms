package com.yozzs.algorithms.pattern.listener;

//事件源接口（被观察者）
public interface IListenerable {
    //为事件源注册监听器
    void setListener(IListener listener);
    //触发监听器
    void triggerListener(ICurdEvent event);
}