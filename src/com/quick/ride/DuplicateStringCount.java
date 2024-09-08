package com.quick.ride;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStringCount {
    public static void main(String[] args){
        String inputArr[] = {"cat","dog","cat","tiger","dog"};

        Map<String,Integer> map = new HashMap<>();

        for(String str : inputArr){
            Integer count = map.get(str);
            if(count == null){
                map.put(str,1);
            }
            else{
                map.put(str,++count);
            }
        }
       Set<String> keySet = map.keySet();
        for(String str : keySet){
            System.out.println(str +"-"+map.get(str));
        }
    }
}
