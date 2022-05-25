public class Task2Ex4 {
    public static void main(String[] args) {
    int a = 5;
    int b = 5;
    int res = 0;
    for (int i = 1; i < b+1; i++){
        res = res + a;
        }
        System.out.println(res);
    int a1 = 3;
    int b1 = 2;
    int res1 = 0;
    int last = 0;
    while (last < b1) {
          res1 = res1 + a1;
          b1 --;
    }
    System.out.println("while " + res1);

    int a2 = 5;
    int b2 = 5;
    int res2 = 0;
       do {
           res2 = res2 + a2;
           b2 --;
       } while (0 < b2);
    System.out.println("do = " + res2);
    }
}
