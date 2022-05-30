package array;

import java.util.Arrays;
import java.util.Random;

public class T3E18 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
            System.out.print(array[i] + "|");

        }
        System.out.println(" ");
        Arrays.sort(array, 0, array.length);
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i] + "|");
        } // для наглядности
        System.out.println(" ");
        System.out.println("Второе по величени число = " + array[array.length - 2]); // потому что отсчёт ебучий начинается с нули c 0 или я хз
            }
        }
