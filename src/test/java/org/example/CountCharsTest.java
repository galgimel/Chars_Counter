package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountCharsTest {

    @Test
    void countCharsTestEmptySpase() {
        CountChars counter = new CountChars();
        Map<Character, Integer> expected = new HashMap<>();
        Map<Character, Integer> actual = counter.countChars("");

        assertEquals(expected, actual);

        expected.put(' ',1);
        expected.put('h',1);
        expected.put('e',1);
        expected.put('l',2);
        expected.put('o',1);
        expected.put('H',1);
        expected.put('E',1);
        expected.put('L',2);
        expected.put('O',1);

        actual = counter.countChars("hello HELLO");

        assertEquals(expected, actual);

        expected.clear();
        actual.clear();

        expected.put('a',18);
        expected.put(' ',1);

        actual = counter.countChars("aaaaaaaaa aaaaaaaaa");

        assertEquals(expected, actual);

    }
}