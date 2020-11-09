package com.yozzs.algorithms.pattern.listener;

public class Test {
    public static void main(String[] args) {
        //定义监听器
        IListener listener = new Listener();
        //定义事件源
        Some some = new Some();
        //事件源注册监听器
        some.setListener(listener);
        some.saveStudent();
        some.removeStudent();
    }
}