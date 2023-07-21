import java.io.*;
import java.util.*;

public class BrandList {
    public ArrayList <Brand> brandList;
    public BrandList(){
        this.brandList = new ArrayList<Brand>();
    }
    
    public boolean loadFromFile(String filename) throws FileNotFoundException{
        File brands = new File(filename);
        
        String brandid, brandname, soundbrand;
        Scanner sc = new Scanner(brands);
        double price;
        try{
            if (!brands.exists()) return false;
            else {
            FileReader fr = new FileReader(filename);
            while (sc.hasNextLine()){
                String [] line = sc.nextLine().split(", ");
                String [] sound = line[2].split(": ");
                Brand brand = new Brand(line[0], line[1], sound [0], Double.parseDouble(sound[1]));
                brandList.add(brand);
                }
            }
        } catch (FileNotFoundException err){
            err.printStackTrace();
            System.out.println();
            return false;
        }
        return true;
        }
    
    public boolean saveToFile(String filename) {
        File brands = new File(filename);
        
        try {
            FileWriter fw = new FileWriter(brands);
            for (Brand brand: brandList){
                fw.write(brand.getBrandID() + ", " + brand.getBrandName() + ", " + brand.getSoundBrand() + ": " + brand.getPrice());
                fw.write("\n");
            }
            fw.close();
        } catch(IOException err){
            err.printStackTrace();
            System.out.println();
        }
        return true;
    }
    
    public int searchID(String bID){
        int n = brandList.size();
        for (int i = 0; i < n; i++){
            if (brandList.get(i).getBrandID().equals(bID.toUpperCase())) return i;
        }
        return -1;
    }
    
    public Brand getUserChoice(){
        Menu mnu = new Menu();
        return (Brand)mnu.ref_getChoice(brandList);
    }
    
    public void addBrand() {
        String BrandID, BrandName, SoundBrand;
        Double Price;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter BrandID: ");
        BrandID = sc.nextLine().toUpperCase();
        if(searchID(BrandID) != -1){
            System.out.println("BrandID already exist!");
        }
        
        System.out.print("Enter BrandName: ");
        BrandName = sc.nextLine();
        if(BrandName == null) System.out.println("Invalid BrandName!");
        
        System.out.print("Enter SoundBrand: ");
        SoundBrand = sc.nextLine();
        if(SoundBrand == null) System.out.println("Invalid SoundBrand!");
        
        System.out.print("Enter Price: ");
        Price = Double.parseDouble(sc.nextLine());
        if(Price <= 0) System.out.println("Invalid SoundBrand!");
        
        Brand brand = new Brand(BrandID, BrandName, SoundBrand, Price);
        brandList.add(brand);
        return;
    }
    
    public void updateBrand(){
        String BrandID, BrandName, SoundBrand;
        Double Price;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BrandID: ");
        BrandID = sc.nextLine().toUpperCase();
        int pos = searchID(BrandID);
        if (pos == -1) {
            System.out.println("BrandID not found!");
            return;
        }
        System.out.print("Enter BrandName: ");
        BrandName = sc.nextLine();
        if (BrandName == null){
            System.out.println("Invalid BrandName");
        }
        System.out.print("Enter SoundBrand: ");
        SoundBrand = sc.nextLine();
        if (SoundBrand == null){
            System.out.println("Invalid SoundBrand");
        }
        System.out.print("Enter Price: ");
        Price = Double.parseDouble(sc.nextLine());
        if (Price <= 0){
            System.out.println("Invalid Price");
        }
        brandList.get(pos).setBrandName(BrandName);
        brandList.get(pos).setSoundBrand(SoundBrand);
        brandList.get(pos).setPrice(Price);
        
        System.out.println("Brand Updated");
    }
    
    public void listBrands(){
        for(Brand brand: brandList){
            System.out.println(brand.getBrandID() + ", " + brand.getBrandName() + ", " + brand.getSoundBrand() + ": " + brand.getPrice());
        }
        
        System.out.println();
    }

    public Brand getBrand(int pos) {
        return brandList.get(pos);
    }
        
}