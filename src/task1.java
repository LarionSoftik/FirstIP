public class task1 {
    public static void main(String[] args) {
        int number = 10;
        int two = 10;
        if (number > 0){
            System.out.println("Число положительное");
        }
        if (number < 0) {
            System.out.println("Чисто отричательное");
        }
        if (number < two) {
            System.out.println("Число" + number + "однозначное");
        }
        if (number>=10 && number<100) {
            System.out.println("Число" + number + "двухзначное");
        }
        if (number>=100 && number<1000) {
            System.out.println("Число" + number + "трёхзначное");
        }

    }
}