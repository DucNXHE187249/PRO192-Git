import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public <E> int int_getChoice(ArrayList<E> options){
        int response;
        Scanner sc = new Scanner(System.in);
        int n = options.size();
        for (int i = 0; i < n; i++){
            System.out.println((1 + i) + ". " + options.get(i).toString());
        }
        
        System.out.print("Your choice: ");
        response = sc.nextInt();
        
        return response;
    }
    public <E> E ref_getChoice(ArrayList<E> options){
        int response;
        int n = options.size();
        
        do {
            response = int_getChoice(options);
        } while (response < 0 || response > n);
        
        return options.get(response - 1);
    }
}
