package array;

import java.util.Random;
import java.util.Scanner;

public class T3E9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int [] array = new int[number];
        int a = 0;
        for (int i = 0; i < array.length; i ++){
            array [i] = random.nextInt(15);
            System.out.print(array[i] + " ");
            a ++;
        }
        int left = 0;
        int mid = a / 2; // + 1;
        int right = 0;
         for (int i = 0; i <= mid; i ++){
             left += array[i];
         }
        System.out.print(left + " ");
         for (int i = mid; i < array.length; i ++){
             right += array [i];
         }
         if (left > right){
             System.out.println("left");
         } else if (right > left) {
             System.out.println("right");
         } else {
             System.out.println("ravny");
         }
    }
}
