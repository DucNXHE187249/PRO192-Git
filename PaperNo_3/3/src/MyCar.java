import java.util.*;

public class MyCar extends Car implements ICar {
    // attribs
    
    
    // constructors
    public MyCar() {}
    
    
    // others
    @Override
    public int f1(List <Car> t) {
        int sum = 0;
        Iterator <Car> subt = t.iterator();
        while (subt.hasNext()) {
            sum += subt.next().getRate();
        }
        
        return (sum / t.size()); 
        
    }
    
    @Override
    public void f2(List <Car> t) {
        int min = t.get(0).getRate(), max = 0, imin = 0, imax = 0;
        
        for (int i = 0; i< t.size(); i++) {
            int temp = t.get(i).getRate();
            if (max < temp) max = temp;
        }
        
        for (int i = 0; i < t.size(); i++) {
            int current = t.get(i).getRate();
            if (current == max) {
                imax= i;
                break;
            }
        }
        
        for (int i = 1; i < t.size(); i++) {
            int temp = t.get(i).getRate();   
            if (min > temp) min = temp;
        }
        
        for (int i = 0; i < t.size(); i++) {
            int temp = t.get(i).getRate();
            if (temp == min) {
                imin = i;
                break;
            }
        }

        Collections.swap(t, imin, imax);
    }
    
    @Override 
    public void f3(List <Car> t) {
        Collections.sort(t, MyCar.compObj);
    }
    
    public static Comparator compObj = new Comparator() {
        @Override
        public int compare(Object e1, Object e2) {
            Car car1 = (Car) e1;
            Car car2 = (Car) e2;
            
            int maker = car1.getMaker().compareTo(car2.getMaker());
            int rate = car1.getRate() - car2.getRate();
            
            if (maker !=0) return maker;
            if (rate> 0) return -1;
            return 1;
        }
    };
}
