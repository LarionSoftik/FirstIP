package array;

import java.util.Random;

public class T3E8 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        int [] array3 = new int[10];
        for (int i = 0; i < array1.length; i ++) {
            array1[i] = random.nextInt(10);
            System.out.print("первый = " + array1 [i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i ++) {
            array2[i] = random.nextInt(10);
            System.out.print("второй = " + array2 [i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < array3.length; i ++) {
            array3[i] = array1[i] + array2[i];
            System.out.print("третий = " + array3 [i] + " "); // что такое вывести количество целый элементов???????
        }
        }
}
