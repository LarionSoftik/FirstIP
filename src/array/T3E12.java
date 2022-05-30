package array;

import java.util.Random;

public class T3E12 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        int sum = 0;
        int schet = 0;
        for (int i = 0; i < array.length; i ++) {
            array [i] = random.nextInt(20);
            if (array[i] % 2 != 0){
                sum += array[i];
                schet ++;
            }
            System.out.print(array[i] + " ");
        }
        int arif = sum / schet;
        System.out.println(" ");
        System.out.println("arifmet = " + arif);
    }
}
