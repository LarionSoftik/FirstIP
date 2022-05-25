public class Task2Ex5 {
    public static void main(String[] args) {
    int s = 1;
    double res = 0;
    double d = 2.54;
    for (int i = 1; i < 21; i ++){
        res = res + s * d;
        System.out.println(res);
    }
        int s2 = 1;
        double res2 = 0;
        while (s2 <= 20) {
            res2 = s2 * d ;
            s2 ++;
        }
        System.out.println("while " + res2);

        int s3 = 1;
        int time2 = 0;
        double res3 = 0;
        do {
            res3 = s3 * d;
            s3 ++;
        } while (s3 <= 20);
        System.out.println("do = " + res3);
    }
}
