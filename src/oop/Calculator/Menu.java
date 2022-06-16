package oop.Calculator;

import java.util.Scanner;

public class Menu implements Calculator {
    Cal cal = new Cal();
    int a;
    int b;

    Scanner scanner = new Scanner(System.in);
    public void mainMenu() {
        System.out.println("Меню");
        System.out.println("Введите - 1, чтобы сложить числа");
        System.out.println("Введите - 2, чтобы вычесть числа");
        System.out.println("Введите - 3, чтобы умножить число на число");
        System.out.println("Введите - 4, чтобы разделить число на число");
        System.out.println("");
        System.out.println("Введите - 0, чтобы закрыть программу");

        if (scanner.hasNextInt()) {
            int enterNumber = scanner.nextInt();
            if (enterNumber == 1) {
                addition();
                cal.addition();
                repeat();
            } else if (enterNumber == 2){
                subtraction();
                cal.subtraction();
                repeat();
            }else if (enterNumber == 3){
                multiplication();
                cal.multiplication();
                repeat();
            }else if(enterNumber == 4){
                division();
                cal.division();
                repeat();
            }else if (enterNumber == 0){
                exit();
            } else {
                while (incorrectNumber()) {
                    incorrectNumber();
                }
            }
        } else {
            System.out.println("Введено неверное значение");
            repeat();
        }
        scanner.close();
    }

    private boolean incorrectNumber(){
        System.out.println("Такой опции не существует, повторите попытку");
        int z = scanner.nextInt();
        boolean check;
        if (z < 5 || z > 0 || z == 0){
            check = false;
        } else {
            check = true;
        }
        return check;
    }
    private void repeat (){
        System.out.println("Введите - 1, чтобы продолжить");
        System.out.println("Введите - 0, чтобы закрыть программу");
        int y = scanner.nextInt();
        if (y == 1){
            mainMenu();
        } else {
            exit();
        }

    }
    private void exit (){
        System.out.println("Close calculator");
        scanner.close();
    }

    private int takeA(){
        System.out.println("Введите первое число");
        cal.a = scanner.nextInt();
        return a;
    }
    private int takeB (){
        System.out.println("Введите второе число");
        cal.b = scanner.nextInt();
        return b;
    }

    @Override
    public void addition() {
        takeA();
        takeB();
    }

    @Override
    public void subtraction() {
        takeA();
        takeB();
        return;

    }

    @Override
    public void multiplication() {
        takeA();
        takeB();
        return;

    }

    @Override
    public void division() {
        takeA();
        takeB();
        return;

    }

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public Menu() {
    }
}
