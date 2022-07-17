package oop.stringtopic;

import java.util.Scanner;

public class CheckJava {
    public static void main(String[] args) {
        CheckTextJava();
    }

    private static void CheckTextJava(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.contains("Java") == true){
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }
    }
}
