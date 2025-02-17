package com.arrays;

public class ReversePairs {
    public static void main(String[] args){
        System.out.println("Muralidharan.N");
        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
       //int[] nums = {4,1,2,3,1};
       // int[] nums ={2,2,2,2};
        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums){
        int cnt =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            //    long temp = 2*nums[j];
                if((long) nums[i] > 2L *nums[j] && i<j ){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
