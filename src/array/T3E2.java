package array;

public class T3E2 {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0, a = 1; i < array.length; i ++, a += 2) {
                array[i] = a;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0, a = 99; i < array.length; i ++, a = a - 2) {
            array[i] = a;
            System.out.print(array[i] + " ");
        }
    }
}
