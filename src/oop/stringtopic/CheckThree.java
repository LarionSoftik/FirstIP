package oop.stringtopic;

import java.util.Scanner;

public class CheckThree {
    public static void main(String[] args) {
        Check();
    }

    private static void Check (){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.endsWith("!!!") == true){
            System.out.println("Есть !!!");
        } else {
            System.out.println("Нету !!!");
        }


    }
}
