import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        int students;
        String[] list;        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        students = sc.nextInt();
        sc.nextLine();
        
        list = new String[students];
        
        System.out.println("Enter students' name: ");
        
        for (int i = 0; i < students; i++) {
            list[i] = sc.nextLine();
            list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1);
        }
        
        for (int i = 0; i < students; i++) {
            System.out.print("\n" + list[i]);
        }
    }
}