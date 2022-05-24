public class task1ex2 {
    public static void main(String[] args) {
        int number =9999;
        if (number > 0) {
            number++;
            System.out.println(number + " Число было положительным");
        }
        if (number <0 ){
            int number2= number- 2;
            System.out.println(number2 + " Число было отрицательным");
        }
        if (number == 0){
            int number3 = 10;
            System.out.println("Число было равно 0, поэтому заменено на " + number3);
        }
    }
}
