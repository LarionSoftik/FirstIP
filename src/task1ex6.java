public class task1ex6 {
    public static void main(String[] args) {
        int employ = 26;
        int num = employ % 10;
        if (num == 1) {
            System.out.println(employ + " Программист");
        }
        if (num >1 && num < 5){
            System.out.println(employ + " Программиста");
        }
        if (num>4 && num<9 ){
            System.out.println(employ + " Программистов");
        }

    }
}
