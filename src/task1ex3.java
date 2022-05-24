public class task1ex3 {
    public static void main(String[] args) {
        int a = 11;
        int b = -10;
        int c = -20;
        int res = 0;
        if (a > 0) {
            res++;
        }
        if (b > 0) {
            res++;
        }
        if (c > 0) {
            res++;
        }
        System.out.println("Количество положительных чисел = " + res);
    }
}
