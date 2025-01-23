package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxScoreFromSubArrayMin {
    public static void main(String[] args){
    List<Integer> arr = new ArrayList<>();
    arr.add(642);
    arr.add(216);
    arr.add(187);
    arr.add(135);
    arr.add(28);
        arr.add(706);
        arr.add(661);
        arr.add(353);
        arr.add(890);
        arr.add(890);

    System.out.println(pairWithMaxSum(arr));

    }
    public static int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int max =0;
        for(int i=0;i<arr.size()-1;i++){
            max = Math.max(max,arr.get(i)+ arr.get(i+1));
            }
        return max;
    }
}
