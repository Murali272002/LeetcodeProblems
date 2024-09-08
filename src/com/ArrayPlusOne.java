package com;

public class ArrayPlusOne {

    public static void main(String[] args) {
       int array[] = {1,2,3,9,9};
       plusOne(array);
    }

    public static int[] plusOne(int[] digits){

        int n = digits.length-1;
        for(int i=n;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                print(digits);
                return digits;
            }
            digits[i] = 0;
        }
        digits =new int[digits.length+1];
        digits[0] = 1;
        print(digits);
        return digits;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
