package oop.CalculatorZheni;

public class CalculatorImpl implements Calculator{

    @Override
    public double action(double a, double b, String action) {
        switch (action){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.println("Ввели не существующее операцию");
        }
        return 0;
    }
}
