package oop.CalculatorZheni;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private int z = 0;
    CalculatorImpl calculator = new CalculatorImpl();
    private double calculatorResult;
    private double [] array = new double[5];


    public void menu () {

        System.out.println("Введите - +, чтобы сложить числа");
        System.out.println("Введите - -, чтобы вычесть числа");
        System.out.println("Введите - *, чтобы умножить число на число");
        System.out.println("Введите - /, чтобы разделить число на число");
        System.out.println("");
        System.out.println("Введите - 0, чтобы закрыть программу");


        while (true) {
            double a = enterValue();
            double b = enterValue();
            avoidWaitingMode();
            String action = enterAction();
            calculatorResult = calculator.action(a, b, action);
            System.out.println(calculatorResult);
            memorizingResult();
            break;
        }
        repeat();
    }

    private void memorizingResult (){
        if (z == 5) {
            z = 0;
        }
        array [z] = calculatorResult;
        System.out.println(Arrays.toString(array));
        z ++;
    }

    private void avoidWaitingMode(){
        scanner.nextLine();
    }

    private double enterValue (){
        double value = 0;
        if (scanner.hasNextDouble()){
            value = scanner.nextDouble();
        } else {
            scanner.next();
            enterValue();
        }
        return value;
    }

    private String enterAction(){
        System.out.println("Введите математическую операцию");
        String operation = null;
        if (scanner.hasNextLine()){
            operation = scanner.nextLine();
        } else {
            enterAction();
        }
        return operation;
    }
    private void repeat (){
        System.out.println("Введите - 1, чтобы продолжить");
        System.out.println("Введите - 0, чтобы закрыть программу");
        int y = scanner.nextInt();
        if (y == 1){
            menu();
        } else {
            exit ();
        }
    }
    private void exit (){
        System.out.println("Close calculator");
        scanner.close();
    }
}



