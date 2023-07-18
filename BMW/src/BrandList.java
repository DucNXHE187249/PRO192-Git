import java.io.File;
import java.util.*;

public class BrandList extends Brand{
    public BrandList(String brandId, String brandName, String soundBrand, int price) {
        super(brandId, brandName, soundBrand, price);
    }
    
    public boolean loadFromFile(String f1){
        File f = new File (f1);
        if (f);
        return false;
    }
    public boolean saveToFile(String f2){
        return false;
    }
    
    public int searchId(String Id){
        return 1;
    }
    
    public Brand getUserChoice(){
        return null;
    }
    
    public void addBrand(){}
    
    public void updateBrand(){}
    
    public void listBrands(){}
    
    
}