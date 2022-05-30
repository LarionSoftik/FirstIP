package array;

import java.util.Random;

public class T3E4 {
    public static void main(String[] args) {
        Random random = new Random();
        String endl = System.getProperty("line.separator");
        int [] array = new int[19];
        for (int i = 0; i < array.length; i ++){
            array [i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++){
            if (i % 2 !=0){
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
