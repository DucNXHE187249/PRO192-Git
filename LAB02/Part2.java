import java.util.Scanner;
import java.util.Arrays;

public class Part2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhap so phan tu: ");
        n = sc.nextInt();

        int[] a = new int [n];

        for (int i = 0; i < n; i++){
            System.out.print("a[" + (i + 1) + "]= ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        Arrays.sort(a);

        System.out.println ("\nSau khi sap xep: ");

        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\nGia tri lon nhat: " + a[n - 1]);
    }
}