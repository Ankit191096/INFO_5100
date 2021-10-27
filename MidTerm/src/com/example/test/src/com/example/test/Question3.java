package com.example.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        int[] array = {1,3,-1,3,4,-1};
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> repeted = new HashSet<>();
        for(int i = 0; i < array.length; i++){
            if(repeted.contains(array[i])){
                list.add(array[i]);
            }else{
                repeted.add(array[i]);
            }
        }
        int sum = 0;
        for (int i: list) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
