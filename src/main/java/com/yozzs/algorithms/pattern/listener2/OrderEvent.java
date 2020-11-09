package com.yozzs.algorithms.pattern.listener2;

/**
 * @Author: liuys23
 * @Date: 2020/11/8
 */
public class OrderEvent implements IOrderEvent {
    private String type;
    private String OrderNumber;
    private Listernerable listernerable;

    public OrderEvent() {
    }

    public OrderEvent(String type, String orderNumber, Listernerable listernerable) {
        this.type = type;
        this.OrderNumber = orderNumber;
        this.listernerable = listernerable;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getOrder() {
        return OrderNumber;
    }

}
