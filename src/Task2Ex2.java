public class Task2Ex2 {
    public static void main(String[] args){
        int ameba = 1;
        for (int i = 1; i < 9; i++ ){
            ameba = ameba * 2;
            System.out.println(ameba + "ameb for" + i + " del");
        }
        int ameba2 = 1;
        int time = 0;
        while (time < 24) {
            ameba2 = ameba2 * 2;
            time = time + 3;
        }
        System.out.println("while " + ameba2);

        int ameba3 = 1;
        int time2 = 0;
        do {
            ameba3 = ameba3 + (ameba3 * 2);
            time2 = time2 + 3;
        } while (time2 < 25);
        System.out.println("do = " + ameba3);
    }
}
