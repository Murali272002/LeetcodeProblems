package com.arrays;

//Remove given elements from the given array
public class RemoveElement {

    public static void main(String[] args){
        int[] arr = {3,2,2,3};
        int val = 3;
        removeElement(arr,val);
    }

    public static int removeElement(int[] nums, int val){
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int[] expectedNums = new int[n];
        int j=0;
        for(int i = 0; i<n-1; i++) {
            if (val != nums[i]) {
                expectedNums[j++] = nums[i];
            }
        }
            if (val!= nums[n-1] ) {
                expectedNums[j++] = nums[n-1];
            }

            for(int i = 0; i<j; i++){
                nums[i] = expectedNums[i];
            }

            System.out.println(j);
        return j;
    }
}
