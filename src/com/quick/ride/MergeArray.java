package com.quick.ride;
public class MergeArray {
    public static void main(String[] args){
        int[] a1= {4,6,8,9,12};
        int[] a2={2,5,7,10,13,15,17};
        mergeArrays(a1,a2);
    }
    public static int[] mergeArrays(int[] a1,int[] a2){
        int sum = a1.length+a2.length;
        int tempArray[] = new int[sum];
        int k=0;
        int i=0;
        int j=0;
        while(i<a1.length && j< a2.length){
            if(a1[i] <= a2[j]){
                tempArray[k++] = a1[i++];
            }else {
                tempArray[k++] =a2[j++];
            }
        }
        while(i<a1.length){
            tempArray[k++] = a1[i++];
        }
        while(j<a2.length){
            tempArray[k++] = a2[j++];
        }
        show(tempArray);
        return tempArray;
    }
    public static void show(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
