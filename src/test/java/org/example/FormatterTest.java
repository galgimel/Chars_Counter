package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {

    @Test
    void formatTestEmptyMap() {
        Formatter formatter = new Formatter();
        Map<Character, Integer> testMap = new HashMap<>();
        String expected = "";
        String actual = formatter.format(testMap);

        assertEquals(expected, actual);

        testMap.put('h',1);
        testMap.put('e',1);
        testMap.put('l',2);
        testMap.put('o',1);

        expected = "e : 1\n" + "h : 1\n" + "l : 2\n" + "o : 1\n";
        actual = formatter.format(testMap);

        assertEquals(expected, actual);
        testMap.clear();

        testMap.put('a', 10);
        expected = "a : 10\n";
        actual = formatter.format(testMap);

        assertEquals(expected, actual);
    }
}