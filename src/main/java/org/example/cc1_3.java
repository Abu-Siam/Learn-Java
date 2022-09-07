package org.example;

import java.util.HashMap;
import java.util.Map;

public class cc1_3 {
    public cc1_3(){}
    public  boolean foundodd(HashMap<Character,Integer> count){
        Boolean foundodd = false;
        for(Map.Entry<Character,Integer> entry :count.entrySet() ){
            if (entry.getValue()%2==1){
                if(foundodd){
                    return false;
                }
                foundodd = true;
            }
        }
        return true;
    }
    public boolean palllindrome_permutatio(String s){
        HashMap<Character,Integer> count = new HashMap<>();
        for (Character c : s.toLowerCase().toCharArray()){
            if(c.equals(' ')) continue;
            else if(!count.containsKey(c)) count.put(c,1);
            else{
                Integer temp = count.get(c)+1;
                count.put(c,temp);
            }
        }
        System.out.println(count);
        return this.foundodd(count);

    }
}
