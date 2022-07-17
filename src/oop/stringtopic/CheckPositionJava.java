package oop.stringtopic;

import java.util.Scanner;

public class CheckPositionJava {
    public static void main(String[] args) {
        CheckPositionJavaInString();
    }

    private static void CheckPositionJavaInString(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int position = text.indexOf("Java");
        System.out.println(position);
        String text2 = text.substring(position);
        System.out.println(text2);
    }
}

