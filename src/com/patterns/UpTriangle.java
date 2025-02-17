package com.patterns;

public class UpTriangle {

    public static void main(String[] args){
        int n =10;
        for(int i=0;i<n;i++){
            //For printing space before star in each row
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //For printing the star in each row
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //For printing the space after star in each row
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
