package com.yozzs.algorithms.pattern.listener2;

public interface IOrderEvent {
    String COMMIT_ORDER = "commit";
    String CANCEL_ORDER = "cancel";

    String getType();
    String getOrder();
}
