package com.taz.algorithms.datastructures;

public class LinkedListTaz<T> {
    LinkedListNode<T> root;
    
    public LinkedListTaz() {
        root = null;
    }
    
    private void addElement(T value) {
        if (root == null) {
            root = new LinkedListNode<T>(value);
        } else {
            LinkedListNode<T> pointer = root;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = new LinkedListNode<T>(value);
        }
    }
    
    private boolean removeElement(T value) {
        LinkedListNode<T> pointer = root;
        while (pointer != null) {
            if (pointer.value.equals(value)) {
                if (pointer.next == null) {
                    pointer.value = null;
                    pointer = null;
                } else {
                    pointer.value = pointer.next.value;
                    pointer.next = pointer.next.next;
                }
                return true;
            } else {
                pointer = pointer.next;
            }
        }
        return false;
        
    }
    
    private void printList() {
        if (root != null) {
            LinkedListNode<T> pointer = root;
            do {
                System.out.print(pointer.value + " ");
                pointer = pointer.next;
            } while (pointer != null);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        LinkedListTaz<Integer> list = new LinkedListTaz<>();
        list.addElement(new Integer(1));
        list.addElement(new Integer(2));
        list.addElement(new Integer(3));
        list.printList();
        
        System.out.println(list.removeElement(10));
        list.printList();
        
        System.out.println(list.removeElement(1));
        list.printList();
        
        list.addElement(new Integer(1));
        list.printList();
        //TODO: fix bug in removing last element.
    }
}
