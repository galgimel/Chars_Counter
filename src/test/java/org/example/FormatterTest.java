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
    }

    @Test
    void formatTestWord() {
        Formatter formatter = new Formatter();
        Map<Character, Integer> testMap = new HashMap<>();
        testMap.put('h',1);
        testMap.put('e',1);
        testMap.put('l',2);
        testMap.put('o',1);

        String expected = "e : 1\n" + "h : 1\n" + "l : 2\n" + "o : 1\n";
        String actual = formatter.format(testMap);

        assertEquals(expected, actual);
    }

    @Test
    void formatTestALotOfChars() {
        Formatter formatter = new Formatter();
        Map<Character, Integer> testMap = new HashMap<>();
        testMap.put('a', 10);
        String expected = "a : 10\n";
        String actual = formatter.format(testMap);

        assertEquals(expected, actual);
    }
}