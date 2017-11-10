package com.taz.algorithms.datastructures;

public class LinkedListNode<T> {
    LinkedListNode<T> next;
    T value;
    
    public LinkedListNode(T value) {
        next = null;
        this.value = value;
    }
}
