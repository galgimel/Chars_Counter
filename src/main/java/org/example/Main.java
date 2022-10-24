package org.example;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CountChars counter = new CountChars();
        Cache cache = new Cache();
        Formatter formatter = new Formatter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для подсчета повторяющихся символов.");
        System.out.println("Для остановки введите с новой строки символ - \"&\"");

        String input = scanner.nextLine();

        while (!input.equals("&")) {
            if (cache.contains(input)) {
                System.out.println(cache.get(input));
            } else {
                Map<Character, Integer> countedCharacter = counter.countChars(input);
                String output = formatter.format(countedCharacter);
                cache.put(input, output);
                System.out.println(output);
            }
            System.out.println("Введите текст для подсчета повторяющихся символов.");
            System.out.println("Для остановки введите с новой строки символ - \"&\"");
            input = scanner.nextLine();
        }
    }
}