package oop.stringtopic;

import java.util.Scanner;

public class HalfWord {
    public static void main(String[] args) {
        makeHalfWord();
    }

    private static void makeHalfWord (){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String text2 = scanner.nextLine();
        String text4 = text.substring(0,text.length() / 2);
        String text5 = text2.substring(text2.length() / 2, text2.length());
        String text3 = text4.concat(text5);
        System.out.println(text3);

    }
}
