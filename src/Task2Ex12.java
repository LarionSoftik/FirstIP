public class Task2Ex12 {
    public static void main(String [] args){
       int n= 82;
       int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum + " ");
        int sum2 = 0;
        for (int i = n; i != 0; i--) { // Написал не должно ровняться нулю, а нахя?
            sum2 = sum2 + (n % 10);
            n = n / 10;
        }
        System.out.println(sum2);
        int sum3 = 0;
        do {
            sum3 += (n%10);
            n /= 10;
        } while (n !=0);
        System.out.println(sum3);
    }
}
