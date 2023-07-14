import java.lang.Math;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class MyString implements IString {
    @Override
    public int f1(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            
            if (isNumeric(Character.toString(current)) == true) {
                if (isPrime(Character.getNumericValue(current)) == true) count++;
            }
        }
        
        return count;
    }
    
    @Override
    public String f2(String str) {
        String[] split = str.split(" ");
        
        List<String> list = (Arrays.asList(split));
        
        Collections.reverse(list);
        
        StringBuilder builder = new StringBuilder(100);
        
        for (String s : list) builder.append(s + " ");
        
        String str_new = builder.toString();
        
        return str_new;
    }
    
    public boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        if (n == 2 || n == 3 || n == 5 || n == 7) return true;
        return false;
    }
    
    public boolean isNumeric(String s) throws NumberFormatException {
        if(s == null) return false;;
        
        try {int x = Integer.parseInt(s);} catch (NumberFormatException nfe) {return false;}
        
        return true;
    }
}
