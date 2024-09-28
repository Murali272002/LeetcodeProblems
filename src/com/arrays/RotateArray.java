package com.arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {-1,-100,3,99};
        rotateArray(arr,2);
    }
    public static void rotateArray(int[] nums, int k){
        int[] tempArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(k == nums.length){
                k=0;
            }
            tempArr[k] = nums[i];
            k++;
        }

        for(int i=0;i<tempArr.length;i++){
            System.out.print(tempArr[i] + " ");
        }
    }
}
