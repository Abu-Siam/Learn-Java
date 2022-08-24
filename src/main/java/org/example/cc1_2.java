package org.example;

import java.util.Arrays;

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
