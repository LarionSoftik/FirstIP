public class task1ex1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Трехугольник не существует");
        }
        else {
            System.out.println("All okey");
        }

    }
}
