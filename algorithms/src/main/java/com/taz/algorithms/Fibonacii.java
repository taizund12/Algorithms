package com.taz.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Fibonacii {
    
    private int fibRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibRecursive(n - 1) + fibRecursive(n - 2);
        }
    }
    
    private void fibRecursiveSeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibRecursive(i) + " ");
        }
    }
    
    private List<Integer> fibRecursiveDynamic(int n) {
        List<Integer> cache = new ArrayList<>();
        cache.add(0, 0);
        cache.add(1, 1);
        for (int i = 2; i <= n; i++) {
            cache.add(i, fibRecursiveDynamic(i, cache));
        }
        return cache;
    }
    
    private int fibRecursiveDynamic(int n, List<Integer> cache) {
        return cache.get(n - 1) + cache.get(n - 2);
    }
    
    public static void main(String[] args) {
        Fibonacii fib = new Fibonacii();
        System.out.println(fib.fibRecursive(5));
        fib.fibRecursiveSeries(10);
        System.out.println();
        System.out.println(fib.fibRecursiveDynamic(100));
    }
}
