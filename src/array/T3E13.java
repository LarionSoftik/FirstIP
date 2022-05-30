package array;

import java.util.Random;

public class T3E13 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        int sum = 0;
        int schet = 0;
        int c = 0; // некоторое число, больше которого должно быть меньше
        for (int i = 0; i < array.length; i ++) {
            array [i] = random.nextInt(20);
            if (array[i] > c){
                sum += array[i];
                schet ++;
            }
            System.out.print(array[i] + " ");
        }
        int arifmet = sum / schet;
        System.out.println(" ");
        System.out.println("arifmet = " + arifmet);
    }
}