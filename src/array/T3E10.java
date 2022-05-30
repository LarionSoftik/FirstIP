package array;

import java.util.Random;
import java.util.Scanner;

public class T3E10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 3) {
            System.out.println("Число не верное");
            n = scan.nextInt();
        } else {
            int [] array = new int[n];
            for (int j = 0; j < array.length; j++) {
                array[j] = random.nextInt(n);
                System.out.print(array[j] + " ");
            }
        }
    }
} // не смог разобраться с этой задачей






//        int n = scan.nextInt();
//        int z;
//        if (n < 4) {
//            for (int i = n; i < 3; i = scan.nextInt()) {
//                System.out.println("неправильное число");
//                if (i > 3) {
//                    z = i;
//                    int[] array = new int[z];
//                    for (int j = 0; j < array.length; j++) {
//                        array[j] = random.nextInt(z);
//                        System.out.print(array[j] + " ");
//                    }
//                }
//            }
//        } // доделать херню, что после else не запускается цикл if
//    }
//}
