// 485. Leetcode problem
//Input parameter Array contains only 0's & 1's
//output : How many No.of maximum 1's in the given input Array, should be return as Integer;

package com.arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args){
        System.out.println("Muralidharan!!");
        int[] arr = {1,0,1,1,0,1};
       int max = maxConsecutiveOnes(arr);
       System.out.println(max);
    }

    //
    public static int maxConsecutiveOnes(int[] nums){
            int count =0;
            int max = count;
            for(int i=0;i<nums.length;i++){
                if(nums[i] == 1){
                    count++;
                    if(count>max){
                        max = count;
                    }
                }
                if(nums[i] == 0){
                    count =0;
                }
            }
            return max;
    }
}
