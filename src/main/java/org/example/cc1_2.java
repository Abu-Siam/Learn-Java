package org.example;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.sort;

public class cc1_2 {
    /**
     * check if 2 stirng permutation to each other
     */
    public static Boolean isperm(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] c =  str1.toCharArray();
        sort(c);
        char[] d = str2.toCharArray();
        sort(d);
        System.out.println(c+" "+ d);
        if(Arrays.equals(c,d)){
            return true;
        }
        return false;
    }

    public static Boolean isperm2(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        Integer[] b = new Integer[128];
        Arrays.fill(b,0);

        char[] charArray = str1.toCharArray();

        for(char c : charArray){
            b[c] += 1;
        }

        charArray = str2.toCharArray();
        for(char c : charArray){
            b[c] -= 1;
            if(b[c] < 0){
                return false;
            }
        }
        System.out.println();
        return true;
    }


}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1 || strs[0].equals("")){
            return strs[0];
        }
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        for(int i = 1; i<strs.length;i++ ){
            if(strs[0].charAt(0) != strs[i].charAt(0)){
                return "";
            }
        }
        String result = "";
        for(int i =0;i<strs.length;i++){
            for(int j = 0;j<strs[0].length();j++){
                if(strs[0].charAt(j) == strs[i].charAt(j)){
                    result+= strs[0].charAt(j);
                }
            }
        }
        return result;
    }
}
