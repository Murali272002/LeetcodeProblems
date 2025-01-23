package com.arrays;

public class MaxSumOfSubArray {
    public static void main(String[] args){
        int[] arr = {1,2,7,-4,3,2,-10,9,1};
       System.out.println(maxSumOfSubArray(arr));
    }
    public static long maxSumOfSubArray(int[] arr){
        long sum = 0;
        long maxSum = sum;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
