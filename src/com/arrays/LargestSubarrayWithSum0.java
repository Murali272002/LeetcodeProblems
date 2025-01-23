package com.arrays;

import java.util.HashMap;

public class LargestSubarrayWithSum0 {
    public static void main(String[] args){
        System.out.println("Muralidharan.N");
        int[] arr = {1,-1,3,-2,2,-8,1,7,10,23};
        maxLength(arr);
    }


//Optimal solution using hashing
    static int maxLength(int[] arr){

        int max =0;
        int sum =0;
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(sum ==0){
                max = i+1;
            }
            else{
                if(mpp.get(sum) != null){
                    max = Math.max(max,i-mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        System.out.println(max);
        return max;
    }
}
