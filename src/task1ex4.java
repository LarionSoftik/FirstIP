public class task1ex4 {
    public static void main(String[] args) {
        int a = 11;
        int b = -10;
        int c = -20;
        int minus = 0;
        int plus = 0;
        if (a > 0) {
            plus++;
        }
        if (b > 0) {
            plus++;
        }
        if (c > 0) {
            plus++;
        }
        if (a < 0) {
            minus--;
        }
        if (b < 0) {
            minus--;
        }
        if (c < 0) {
            minus--;
        }

        System.out.println("Количество положительных чисел = " + plus);
        System.out.println("Количество отрицательных чисел = " + minus);
    }
}
