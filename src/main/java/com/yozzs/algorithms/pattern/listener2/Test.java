package com.yozzs.algorithms.pattern.listener2;

/**
 * @Author: liuys23
 * @Date: 2020/11/8
 */
public class Test {
    public static void main(String[] args) {
        OrderAction orderAction = new OrderAction();
        orderAction.addLitener(new DBListener());
        orderAction.addLitener(new MQListener());
        orderAction.commitOrder("10001");
    }
}
