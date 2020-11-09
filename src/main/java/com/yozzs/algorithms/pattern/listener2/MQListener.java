package com.yozzs.algorithms.pattern.listener2;

/**
 * @Author: liuys23
 * @Date: 2020/11/8
 */
public class MQListener implements Listener {
    @Override
    public void onEvent(IOrderEvent event) {
        System.out.println(this.getClass().getSimpleName() + "监听到事件：" + event.getType() + " order:" + event.getOrder());
    }
}
