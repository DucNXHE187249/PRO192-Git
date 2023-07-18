import java.util.*;

public class MyCar implements ICar{
    @Override
    public int f1 (List<Car>t) {
        int i, n, s;
        Car x;
        n =t.size();
        double avg, sum = 0;
        for (i = 0; i < n; i++){
            x = t.get(i);
            sum += x.getRate();
        }
        avg = sum/n;
        s = (int) avg;
        return s;
    }

    @Override
    public void f2(List<Car>t){
        int max = 0, maxt = 0, min = 0, mint;
        for (int i = 0; i < t.size(); i++){
            if (max < )
        }
    }

    @Override
    public void f3(List<Car>t){
        
    }
}