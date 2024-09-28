package com.arrays;

public class MissingNumber {

    public static void main(String[] args){
        int[] arr = {2,19,10,1,5,3,28,18,24,23,9,22,29,25,6,27,4,20,21,26,11,8,17,15,16,12,7,14};
        missingNumber(arr,29);
    }

    public static int missingNumber(int[] a,int N){
//            int temp;
//            for(int i=0;i<a.length;i++){
//                for(int j=i+1;j<a.length;j++){
//                    if(a[i]>a[j]){
//                        temp = a[i];
//                        a[i]=a[j];
//                        a[j]=temp;
//                    }
//                }
//                System.out.print(a[i]+ " ");
//            }
//            int b=1;
//            for(int i=0;i<a.length;i++){
//                if(a[i] == b){
//                    b++;
//                }else{
//                    break;
//                }
//            }
//            System.out.println();
//            System.out.println("Missing number");
//            System.out.println(b);
//            return b;
        // optimal code
//        int sum = (N*(N+1))/2;
//        int sum2 = 0;
//        int num = 0;
//
//        for(int i=0;i<a.length;i++){
//            sum2+=a[i];
//        }
//        num = sum-sum2;
//        System.out.println(num);
//
//        return num;
        // brute-force approach
        for(int i=1;i<=N;i++){
            int flag =0;
            for(int j=0;j<N-1;j++){
                if(a[j] == i){
                    flag =1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
        }
}


