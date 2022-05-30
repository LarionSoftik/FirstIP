package array;

import java.util.Random;

public class T3E16 {
    public static void main(String[] args) {
        Random random = new Random();
        int c = 10;
        int[] array = new int[c];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        int z = 0;
        for (int j = 0; j < array.length; j++){
            for (int i = 0; i < array.length; i++) {
                if (array [j] == array[i] ){
                    z++;
                }
            }
        }
        if (z>c){
            System.out.println("Есть похожие");
        } else {
            System.out.println("Похожих нет");
        }
    }
}
