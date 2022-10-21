package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashMap<Character, Integer> mapChars = new HashMap<>();
        new CountChars().countChars(input, mapChars);
        new Print().printCharsCount(mapChars);
    }
}