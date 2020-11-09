package com.yozzs.algorithms.pattern.listener;

public interface ICurdEvent{
    //声明事件类型
    String Create_EVENT = "create event";
    String Update_EVENT = "update event";
    String Retrieve_EVENT = "retrieve event";
    String Delete_EVENT = "delete event";
    //获取事件源对象
    IListenerable getEventSource();
    //获取事件类型
    String getEventType();

}