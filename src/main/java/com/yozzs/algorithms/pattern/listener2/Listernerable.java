package com.yozzs.algorithms.pattern.listener2;

public interface Listernerable {
    void addLitener(Listener listener);
    void publishEvent(IOrderEvent event);
}
