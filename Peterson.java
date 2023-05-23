import java.util.Scanner;

public class Peterson {
    public static void main (String[] args) {
        int n, sumpet = 0;
        int pet[];
        pet = new int [10];
        pet[0] = 1;
        pet[1] = 1;
        pet[2] = pet[1] * 2;
        pet[3] = pet[2] * 3;
        pet[4] = pet[3] * 4;
        pet[5] = pet[4] * 5;
        pet[6] = pet[5] * 6;
        pet[7] = pet[6] * 7;
        pet[8] = pet[7] * 8;
        pet[9] = pet[8] * 9;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        n = scan.nextInt();
        int nn = n;
        while (n != 0){
            sumpet += pet[n % 10];
            n /= 10;
        }
        // System.out.println("Sumpet = "+sumpet);

        if (sumpet ==  nn){
            System.out.println(+nn+" is a Peterson number");
        } else System.out.println(+nn+" is not a Peterson number");
    }   
}