package com.arrays;

public class RemoveDuplicates {

    public static void main(String[] args){
        int[] arr ={1,1,2,2,3,4,4,5};
        removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] arr){
        int n = arr.length;
        int[] expectedNums = new int[n];
        int j = 0;
        for(int i=0; i<n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                expectedNums[j++] = arr[i];
            }
        }
            expectedNums[j++] = arr[n-1];

        for(int i=0; i<j;i++){
            arr[i] = expectedNums[i];
            System.out.println(arr[i]);
        }
        return j;
    }
}
