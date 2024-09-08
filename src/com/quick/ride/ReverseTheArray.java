package com.quick.ride;

public class ReverseTheArray {
    public static void main(String[] args){
        int inputArray[] = {1,2,3,4,5};

        int tempArray[] = new int[inputArray.length];

        int count = 0;

        for(int i = inputArray.length-1; i >= 0 ;i--){

            tempArray[count] = inputArray[i];

            System.out.print(tempArray[count]+" ");
            count++;
        }



    }
}
