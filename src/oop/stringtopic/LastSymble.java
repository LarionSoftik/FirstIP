package oop.stringtopic;

import java.util.Scanner;

public class LastSymble {
    public static void main(String[] args) {
        showLast();

    }

    private static void showLast() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int numberSymble = text.length() - 1;
        char last = text.charAt(text.length()-1);
        System.out.println(last); // недоделал(
    }

}
