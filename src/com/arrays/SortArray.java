package com.arrays;

//Sorting the Given array in descending order
public class SortArray {

    public static void main(String[] args){
        int[] arr = {4,7,3,10,8,2,9,2};
        SortArray sortArray = new SortArray();
        sortArray.descendingOrder(arr);
    }

    public int[] descendingOrder(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] <= arr[j]){ // If u mention arr[i]>arr[j] then it is sorting in ascending order;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}
