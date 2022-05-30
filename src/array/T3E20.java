package array;

import java.util.Arrays;
import java.util.Random;

public class T3E20 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array [i] = random.nextInt(10);
            System.out.print(array[i]);
        }
        Arrays.sort(array, 0, array.length);
        System.out.println(" ");
        array[0] = array[9];
        System.out.println(array[0]);
    }
}
