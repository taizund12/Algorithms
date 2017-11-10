package com.taz.algorithms.datastructures;

public class StackNode<T> {
    StackNode<T> next = null;
    T value;
    public StackNode(T value) {
       this.value = value;
    }
}
