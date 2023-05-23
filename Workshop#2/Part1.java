import java.util.Scanner;

public class Part1 {
    public static void main(String [] args) {
        boolean cont = false;
        do {
            try {
                int num;
                Scanner sc = newInt();
                System.out.println("Enter the number" );
                if (num < 1) throw new Exception();
                System.out.println("The number is: "+ num);
                cont = false;
            } catch(Exception e) {
                System.out.println("The number is invalid");
                cont = true;
            }
        } while (cont);
    }
}
