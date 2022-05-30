package array;

import java.util.Arrays;
import java.util.Random;

public class T3E19 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + "|");

        }
        System.out.println(" ");
        Arrays.sort(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            int min = Math.min(array[i], array[9]);
            if (min % 2 == 0) {
                System.out.println("наименьшее чётное = " + min);
                break;
            }
        }
    }
}

