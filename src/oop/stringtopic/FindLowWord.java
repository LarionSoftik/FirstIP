package oop.stringtopic;

import java.util.Scanner;

public class FindLowWord {
    public static void main(String[] args) {
        FindLowWordInString();
    }

    private static void FindLowWordInString(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] text2 = text.split(" ");
        int number = 0;
        int size = 0;
        int numberOfWord = 0;
        while (number < 10) { // цикл хуйня
            if (text2[number].length() > size) {
                size = text2[number].length() - 1;
                numberOfWord ++;
                number++;
            } else {
                number++;
            }
        }
        System.out.println("The most biggest word - " + text2[numberOfWord]);
}
}
