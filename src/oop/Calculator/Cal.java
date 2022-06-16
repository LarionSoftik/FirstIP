package oop.Calculator;

import java.util.Scanner;

public class Cal implements Calculator {
    int a;
    int b;
    public void addition (){
        int result = a + b;
        System.out.println(a + "+" + b + " = " + result);
    }

    public void subtraction () {
        int result = a - b;
        System.out.println(a + "-" + b + " = " + result);

    }

    public void multiplication () {
        int result = a * b;
        System.out.println(a + "*" + b + " = " + result);
    }

    public void division () {
        int result = a / b;
        System.out.println(a + "/" + b + " = " + result);

    }

}

