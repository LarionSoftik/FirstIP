package array;

import java.util.Random;

public class T3E11 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        for (int i = 0; i < array.length; i ++ ){
            array[i] = random.nextInt(100);
            if (array[i] % 3 == 0){
                System.out.print(array[i] +" ");
            }
        }


    }
}
