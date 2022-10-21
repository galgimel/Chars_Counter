package org.example;

import java.util.HashMap;

public class CountChars {
    public void countChars(String toCount, HashMap<Character, Integer> mapChars){
        char[] chars = toCount.toCharArray();
        for (char c : chars){
            if (mapChars.containsKey(c)){
                Integer i = mapChars.get(c);
                mapChars.put(c, i+1 );
            } else {
                mapChars.put(c, 1);
            }
        }
    }
}
