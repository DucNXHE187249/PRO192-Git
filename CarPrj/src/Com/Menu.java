package Com;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Menu {
    public <E> int int_getChoice(ArrayList<E> options) {
        int response;
        int n = options.size();
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + ". " + options.get(i).toString());
        }
        
        System.out.print("\nPlease select an option: ");
        response = sc.nextInt();
        
        System.out.println();
 
        return response;
    }
    
    public <E> E ref_getChoice(ArrayList<E> options) {
        int response;
        int n = options.size();
        
        do {
            response = int_getChoice(options);
        } while (response < 0 || response > n);
        
        return options.get(response - 1);
    }
}
