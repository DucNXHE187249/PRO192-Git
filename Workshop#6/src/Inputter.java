import java.util.Scanner;

public class Inputter{
    
    public static Scanner sc = new Scanner (System.in);

    public int inputInt(String msg, int min, int max){
        if (min > max){
            int t = min;
            min = max;
            max = t;
        }

        int dat;
        do {
            System.out.print(msg);
            dat = Integer.parseInt(sc.nextLine());
        }
        while (dat < min || dat > max);
        return dat;
    }
    
    public String inputStr(String msg){
        System.out.print(msg);
        String dat = sc.nextLine().trim();
        return dat;
    }
    
    public String intputNonBlankStr(String msg){
        String dat;
        do{
            System.out.print(msg);
            dat = sc.nextLine().trim();
        }
        while (dat.length() == 0);
        return dat;
    }
    
    public String inputPattern(String msg, String pattern){
        String dat;
        do{
            System.out.print(msg);
            dat = sc.nextLine().trim();
        }
        while(!dat.matches(pattern));
        return dat;
    }
}