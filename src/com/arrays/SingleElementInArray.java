//136. Find the Single element in the given array
package com.arrays;

public class SingleElementInArray {

    public static void main(String[] args){
        System.out.println("Muralidharan!!");
        int[] arr = {4,1,2,1,2};
        int num = getSingleNumber(arr);
        System.out.println(num);
    }
    public static int getSingleNumber(int[] arr){

//        for(int i=0;i<arr.length;i++){
//            int count =0;
//            int num = arr[i];
//            for(int j=0;j<arr.length;j++){
//                if(num == arr[j]){
//                    count++;
//                }
//            }
//            if(count == 1) return num;
//        }
//        return -1;

        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
