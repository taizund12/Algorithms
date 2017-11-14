package com.taz.algorithms;

import java.util.Arrays;
import java.util.List;

public class DivideAndConquer {
    
    private void divideAndConquerList(List<Integer> list, int i, int j) {
        if (i <= j && i >= 0 && j <= list.size() - 1) {
            int index = (i + j) / 2;
            System.out.print(list.get(index) + " ");
            divideAndConquerList(list, i, index - 1);
            divideAndConquerList(list, index + 1, j);
        }
    }
    
    public static void main(String[] args) {
        DivideAndConquer dnc = new DivideAndConquer();
        dnc.divideAndConquerList(Arrays.asList(1, 2, 3, 4, 5), 0, 4);
        System.out.println();
    }
}
