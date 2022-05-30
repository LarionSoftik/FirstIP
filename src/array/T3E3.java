package array;

import java.util.Random;

public class T3E3 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[14];
        int a = 0;
        for (int i = 0; i < array.length; i ++){
            array [i] = random.nextInt(99);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0 && array[i] > 0){
                a++;
            }

        }
        System.out.println("В массиве " + a + " чётных элементов");
    }
}
