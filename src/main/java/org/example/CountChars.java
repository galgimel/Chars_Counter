package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountChars {

    public Map<Character, Integer> countChars(String input) {

        char[] chars = input.toCharArray();
        Map<Character, Integer> result = new HashMap<>();
        for (char c : chars) {
            if (result.containsKey(c)) {
                Integer i = result.get(c);
                result.put(c, i + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }
}
