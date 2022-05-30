package array;

import java.util.Random;

public class T3E15 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i +=2){
            array [i] = 0;
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
