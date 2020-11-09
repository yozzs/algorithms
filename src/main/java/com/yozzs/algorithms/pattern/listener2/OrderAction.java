package com.yozzs.algorithms.pattern.listener2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liuys23
 * @Date: 2020/11/8
 */
public class OrderAction implements Listernerable {
    List<Listener> listeners;

    public OrderAction() {
        this.listeners = new ArrayList<>();
    }

    public OrderAction(List<Listener> listeners) {
        this.listeners = listeners;
    }

    @Override
    public void addLitener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void publishEvent(IOrderEvent event) {
        listeners.forEach(e -> e.onEvent(event));
    }

    public void commitOrder(String orderNumber){
        System.out.println("提交订单 " + orderNumber);
        this.publishEvent(new OrderEvent(IOrderEvent.COMMIT_ORDER, orderNumber, this));
    }

    public void cancelOrder(String orderNumber){
        System.out.println("取消订单 " + orderNumber);
        this.publishEvent(new OrderEvent(IOrderEvent.CANCEL_ORDER, orderNumber, this));
    }
}
