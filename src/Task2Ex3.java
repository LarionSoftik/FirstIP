public class Task2Ex3 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 1;
        for (int i = 1; i <= 8; i++) {
            num = num * 2;
            sum = sum + num;
        }
        System.out.println(sum);
        int num2 = 1;
        int sum2 = 0;
        while (num2 <= 256) {
            sum2 = sum2 + num2;
            num2 = num2 * 2;
        }
        System.out.println("while " + sum2);

        int num3 = 1;
        int sum3 = 0;
        do {
            sum3 = sum3 + num3;
            num3 = num3 * 2;
        } while (num3 <= 256);
        System.out.println("do = " + sum3);
    }
}

