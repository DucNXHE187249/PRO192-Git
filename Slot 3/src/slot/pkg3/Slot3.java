package slot.pkg3;

public class Slot3 {
    public static void main(String[] args) {
        int ar[];
        int i, sum = 0, avg;
        ar = new int [5];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        ar[3] = 4;
        ar[4] = 5;
        
        for (i = 0; i < 5; i++){
            sum += ar[i];
        }
        
        avg = sum / 5;
        
        System.out.println(avg);
    }
}
