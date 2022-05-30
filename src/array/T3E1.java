package array;

public class T3E1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0, a = 2; i < array.length; i++, a += 2) {
            array[i] = a;
                System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0, a = 2; i < array.length; i++, a += 2) {
            array[i] = a;
            System.out.println(array[i]);
            System.out.println(" ");
        }
    }
}


