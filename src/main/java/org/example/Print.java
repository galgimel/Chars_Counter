package org.example;

import java.util.HashMap;

public class Print {
    public void printCharsCount(HashMap<Character, Integer> map){
        for (Character key : map.keySet()){
            System.out.println("\"" + key + "\" - " + map.get(key));
        }
    }
}
