package com.strings;

public class CountVowels {
    public static void main(String[] args){
        String vowels = "RohithRaju";
        int count =0;
        for(int i=0;i<vowels.length();i++){
            if(vowels.charAt(i) == 'a' || vowels.charAt(i) =='A'){
                    count++;
            }
            else if(vowels.charAt(i) == 'e' || vowels.charAt(i) =='E'){
                count++;
            }
            else if(vowels.charAt(i) == 'i' || vowels.charAt(i) =='I'){
                count++;
            }
            else if(vowels.charAt(i) == 'o' || vowels.charAt(i) =='O'){
                count++;
            }
            else if(vowels.charAt(i) == 'u' || vowels.charAt(i) =='U'){
                count++;
            }
        }
          System.out.println(count);
    }
}
