package com.quick.ride;

public class Pattern1 {
    public static void main(String[] args){
        int numRows = 4;

        int i,j;
        for( i=1; i<=numRows; i++){
            for( j=1; j<=2*(numRows-i); j++){
                System.out.print(" ");
            }
            for( j = i; j>=1;j--){
                System.out.print(j + " ");
            }

            for( j = 2; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
