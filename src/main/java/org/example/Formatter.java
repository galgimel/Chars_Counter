package org.example;

import java.util.Map;

public class Formatter {
    public String format(Map<Character, Integer> countedCharacters) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : countedCharacters.entrySet()) {
            result.append(entry.getKey() + " : " + entry.getValue() + "\n");
        }
        return result.toString();
    }
}
