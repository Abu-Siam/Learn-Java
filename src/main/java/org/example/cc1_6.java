package org.example;

public class cc1_6 {
    public static String compressString(String str) {
        String compressed = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressed += ""+str.charAt(i)+count;
                count =0;
            }
        }
        return  compressed;
    }
}
