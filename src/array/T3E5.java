package array;

import java.util.Random;

public class T3E5 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[5];
        int [] array2 = new int[5];
        int sumF = 0;
        int sum = sumF /5;
        int sumS = 0;
        int sum1 = sumS / 5;
        for (int i = 0; i < array.length; i ++){
            int a = random.nextInt(20);
            sumF += a;
            array[i] = a;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i ++) {
            int a = random.nextInt(20);
            sumS += a;
            array2[i] = a;
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        if (sumF > sumS){
            System.out.println("Среднее арифм первого массива больше");
        } else if (sumS > sumF){
            System.out.println("Ср арифм второго масс больше");
        } else {
            System.out.println("Элементы массива равны");
        }
    }
}
