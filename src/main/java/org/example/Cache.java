package org.example;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String, String> cache = new HashMap<>();

    public void put(String input, String output) {
        cache.put(input, output);
    }

    public boolean contains(String input) {
        return cache.containsKey(input);
    }

    public String get(String input){
        return cache.get(input);
    }
}
