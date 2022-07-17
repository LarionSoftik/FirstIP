package oop.stringtopic;

import java.util.Scanner;

public class ILikeJava {
    public static void main(String[] args) {
        System.out.println(takeTexts());

    }

    private static String takeTexts (){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

}
