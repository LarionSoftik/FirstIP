public class Task2Ex7 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                int num2 = 1;
                while (num2 <= 100) {
                    num2++;
                    if (num2 % 2 != 0) {
                        System.out.println(num2); // а чего до 101?
                    }
                }
                int num3 = 1;
                int last = 100;
                do {
                    num3++;
                    if (num3 % 2 != 0) {
                        System.out.println(num3);
                    }
                } while (num3 <= last);
            }
        }
    }
}