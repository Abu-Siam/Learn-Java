package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Practice {
    public void Practice(){
        ArrayList<String> newArray = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        newArray.addAll(Arrays.asList("asd","asf"));
        HashMap<Integer,String> hmap = new HashMap<>();
        StringBuilder sentence = new StringBuilder("i am a ");
        sentence.append("gamer");
        hmap.put(1,"a");
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(1);
        llist.add(2);
        Boolean b= llist.contains(2);
        System.out.println(b);
        System.out.println(newArray);
    }
}
