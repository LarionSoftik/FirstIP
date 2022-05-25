public class Tast2Ex1 {
    public static void main(String[] args){
        double dist = 10;
        double norm = 0.1;
        for (int i = 1; i < 8; i++){
            dist = dist + (dist * norm);
        }
        System.out.println(dist);
        int days = 1;
        double dist2 = 10;
        while (days <= 7) {
            dist2 = dist2 + (dist2 * norm);
            days ++;
        }
        System.out.println("while " + dist2);
        double dist3 = 10;
        int finish = 7;
        do {
            dist3 = dist3 + (dist3 * norm);
            finish --;
        } while (finish > 0);
        System.out.println("do = " + dist3);
    }
}
