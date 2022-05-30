package array;

import java.util.Random;

public class T3E17 {
    public static void main(String[] args) {
        Random random = new Random();
        int c = 10;
        int serch = 55;
        int[] array = new int[c];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int z = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == serch) {
                z++;
            }
        }
            if (z > 0) {
                System.out.println("Элемент " + serch + " встречается = " + z + " раз");
            } else {
                System.out.println(serch + " Не встречается");
            }
    }
}
