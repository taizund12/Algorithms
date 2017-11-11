package com.taz.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * some string manipulation algorithms
 *
 */
public class StringManipulation {
    
    private void getAllCombinationsOfString(String value) {
        getAllCombinationsOfString("", value);
        System.out.println();
    }
    
    private void getAllCombinationsOfString(String prefix, String value) {
        if (value == null || value.isEmpty()) {
            System.out.print(prefix +",");
        } else {
            for (int i = 0; i < value.length(); i++) {
                String pre = prefix + value.substring(i, i + 1);
                String post = value.substring(0, i) + value.substring(i + 1, value.length());
                getAllCombinationsOfString(pre, post);
            }
        }
    }
    
    private void getAllCombinationsOfStringAsList(String value) {
        List<String> list = new ArrayList<String>();
        System.out.println(getAllCombinationsOfStringAsList("", value, list));
    }
    
    private List<String> getAllCombinationsOfStringAsList(String prefix, String value, List<String> list) {
        if (value == null || value.isEmpty()) {
            list.add(prefix);
        } else {
            for (int i = 0; i < value.length(); i++) {
                String pre = prefix + value.substring(i, i + 1);
                String post = value.substring(0, i) + value.substring(i + 1, value.length());
                getAllCombinationsOfStringAsList(pre, post, list);
            }
        }
        return list;
    }
    
    private void getPowerSet(String value) {
        if(value == null || value.isEmpty()) {
            return;
        }
        for(int i = 0; i < value.length(); i++) {
            String pre = value.substring(0, i+1);
            String post = value.substring(i+1, value.length());
            System.out.print(pre + " ");
            getPowerSet(post);
        }
    }
    
    public static void main(String[] args) {
        StringManipulation manipulation = new StringManipulation();
        manipulation.getAllCombinationsOfString("abc");
        manipulation.getAllCombinationsOfStringAsList("abc");
        manipulation.getPowerSet("abcd");
        
    }
}
