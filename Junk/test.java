import java.until.Scanner;
public class test {
    public static void main(String args[]){ 
        int ar[];
        int i, sum = 0, avg, mindiff;
        
        ar = new int[5];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        ar[3] = 4;
        ar[4] = 5;
        
        for (i = 0; i < 5; i++){
            sum += ar[i];
        }
        
        avg = sum / 5;
        
        mindiff = sum;
        
        for (i = 0; i < 5; i++){
            if (ar[i] < avg && avg - ar[i] < mindiff){
                mindiff = avg - ar[i];
            }
        }
        System.out.println(sum);
    }
}
