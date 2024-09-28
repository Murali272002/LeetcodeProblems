package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static void main(String[] args){

        int[] a = {1,2,3,1,1,1};
        System.out.println(longestSubArray(a,3));


    }
    public static int longestSubArray(int[] a, int K){
        Map<Long,Integer> preSumMap = new HashMap<>();
        long sum =0;
        int maxLen = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum == K) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum - K;
            if(preSumMap.containsKey(rem)){
                int len = i-preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
        return maxLen;
    }
}
