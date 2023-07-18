import java.util.*;

public class Menu extends CarManager{
    public <E> int int_getChoice (ArrayList <E> options){
        int response;
        int n = options.size();
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= n; i++){
            System.out.println((i+1) + "." + options.get(i).toString());
        }
        System.out.print("Select an option: ");
        response = sc.nextInt();
        return response;
    }
    public <E> E ref_getChoice (ArrayList <E> options){
        int response;
        int n = options.size();
        do {
            response = int_getChoice(options);
        }while (response < 0 || response > n);
        return options.get(response - 1);
    }
}