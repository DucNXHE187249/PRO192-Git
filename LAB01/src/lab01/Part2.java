import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        float num1, num2;
        String ope;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        num1 = sc.nextFloat();
        System.out.println("Input the second number: ");
        num2 = sc.nextFloat();
        System.out.println("Enter the operator (+ - * /) : ");
        sc = new Scanner(System.in);
        ope = sc.nextLine();
        if (ope.equals("+")){
            System.out.println("Result: "+ num1 + ope + num2 +" = "+ (num1+num2));
        }
        if (ope.equals("-")){
            System.out.println("Result: "+ num1 + ope + num2 +" = "+ (num1-num2));
        }
        if (ope.equals("*")){
            System.out.println("Result: "+ num1 + ope + num2 +" = "+ (num1*num2));
        }
        if (ope.equals("/")){
            System.out.println("Result: "+ num1 + ope + num2 +" = "+ (num1/num2));
        }
    }
}