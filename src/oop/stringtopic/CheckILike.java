package oop.stringtopic;

import java.util.Scanner;

public class CheckILike {
    public static void main(String[] args) {
        CheckStringIfILike();
    }

    public static void CheckStringIfILike(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.startsWith("I like") == true){
            System.out.println("Condition true!");
        } else {
            System.out.println("Condition false(");
        }
    }
}
