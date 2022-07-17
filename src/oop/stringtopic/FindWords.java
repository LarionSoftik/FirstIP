package oop.stringtopic;

import java.util.Scanner;

public class FindWords {
    public static void main(String[] args) {
        FindWordsAt3To5();
    }

    private static void FindWordsAt3To5(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] textPath = text.split(" ");
        int number = 0;
        while (textPath[number] != null){ // не знаю какое тут условие должно быть, оно работает, но в конце выдаёт ошибку
            if (textPath[number].length() > 2 && textPath[number].length() < 6){
                System.out.println(textPath[number]);
                number ++;
            } else {
                number ++;
            }
        }
    }
}
