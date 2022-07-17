package oop.stringtopic;

import java.util.Scanner;

public class ChangeWords {
    public static void main(String[] args) {
        ChangeAToO();
    }

    private static void ChangeAToO(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.replace('a','o'));
    }
}
