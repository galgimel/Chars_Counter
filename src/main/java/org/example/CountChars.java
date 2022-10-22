package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class CountChars {
    static HashMap<Character, Integer> cash = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static String input = scanner.nextLine();

    public static void countChars() {
        while (!input.equals("&") && scanner.hasNextLine()) {
                char[] chars = input.toCharArray();
                for (char c : chars) {
                    if (cash.containsKey(c)) {
                        Integer i = cash.get(c);
                        cash.put(c, i + 1);
                    } else {
                        cash.put(c, 1);
                    }
                }
            input = scanner.nextLine();
            }
        }
    }
