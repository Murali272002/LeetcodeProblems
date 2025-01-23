package com.arrays;

public class AlternatePosAndNegNum {

    public static void main(String[] args){
        System.out.println("Muralidharan!!!");
        int[] b = {1,2,-3,-2,-1,3};
        alternateNumbers(b);

    }
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
//        int N = a.length;
//        int b[] = new int[N/2];
//        int c[] = new int[N/2];
//
//        int x=0;
//        int y=0;
//        int z=0;
//        while(x<N){
//            if(a[x]>0){
//                b[y++] = a[x++];
//            }
//            else if(a[x]<0){
//                c[z++] = a[x++];
//            }
//        }
//        int i=0;
//        int j=0;
//        int k=0;
//        while(i<N){
//            a[i++] = b[j++];
//            a[i++] = c[k++];
//        }
//        return a;
        int N = a.length;
        int b[] = new int[N];
        int posIndex = 0;
        int negIndex = 1;
        int i=0;
        while(i<N){
            if(a[i]>0){
                b[posIndex] = a[i++];
                posIndex+=2;
            }
            else{
                b[negIndex] = a[i++];
                negIndex+=2;
            }
        }
        for(int j=0;j<b.length;j++) {
            System.out.print(b[j]+" ");
        }
        return b;
    }


}
