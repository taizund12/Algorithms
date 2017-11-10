package com.taz.algorithms.datastructures;

public class StackTaz<T> {
    StackNode<T> root;
    
    public StackTaz() {
        root = null;
    }
    
    private void push(T value) {
        if (root == null) {
            root = new StackNode<>(value);
        } else {
            StackNode<T> pointer = new StackNode<>(value);
            pointer.next = root;
            root = pointer;
        }
    }
    
    private StackNode<T> peek() {
        return root;
    }
    
    private T pop() {
        if (root != null) {
            T data = root.value;
            root = root.next;
            return data;
        }
        return null;
    }
    
    public static void main(String[] args) {
        StackTaz<Integer> stack = new StackTaz<>();
        stack.push(new Integer(1));
        System.out.println(stack.peek().value);
        stack.push(new Integer(2));
        System.out.println(stack.peek().value);
        stack.push(new Integer(3));
        System.out.println(stack.peek().value);
        System.out.println();
        stack.pop();
        System.out.println(stack.peek().value);
        stack.pop();
        System.out.println(stack.peek().value);
    }
    
}
