package com.yozzs.algorithms.list.block;

public interface Queue<E> {
    int size();
    void offer(E e);
    E take();
}
