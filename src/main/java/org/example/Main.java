package org.example;

import static org.example.CountChars.cash;
import static org.example.CountChars.countChars;
import static org.example.Print.printCharsCount;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст для подсчета повторяющихся символов.");
        System.out.println("Для остановки введите с новой строки символ - \"&\"");
        countChars();
        printCharsCount(cash);
    }
}