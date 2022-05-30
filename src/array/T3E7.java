package array;

import java.util.ArrayList;
import java.util.Random;

public class T3E7 {
    public static void main(String[] args) {
        Random ramdom = new Random();
        int [] array = new int[12];
        for (int i = 0; i < array.length; i ++){
            array [i] = ramdom.nextInt(15);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int maxNum = Math.max(array[0], array[array.length - 1]); // без минус 1 не работает, шо за дела
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNum != array[i]){
                index ++;

            } else{
                break;
            }

        }

        System.out.println("Maximum number = " + maxNum);
        System.out.println("position = " + index);
    }
}
