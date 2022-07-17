package oop.stringtopic;

import java.util.Scanner;

public class ChangeTop {
    public static void main(String[] args) {
        ChangeTopRegister();
    }

    private static void ChangeTopRegister(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
    }
}
