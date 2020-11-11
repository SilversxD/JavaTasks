package ru.silversxd.javaTasks.task18;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder word = new StringBuilder(scanner.nextLine());
        if (word.reverse().toString().equals(word.reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}