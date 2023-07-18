package Com;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrandList {
    public ArrayList<Brand> brandList;
    
    public BrandList() {
        this.brandList = new ArrayList<Brand>();
    }    
    
    public boolean loadFromFile(String filename) throws FileNotFoundException {
        try {
            File brands = new File(filename);
            Scanner sc = new Scanner(brands);
            
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(", ");
                String[] soundSystem = data[2].split(": ");
                Brand brand = new Brand(data[0], data[1], soundSystem[0], Double.parseDouble(soundSystem[1]));
                brandList.add(brand);
                
            }
        } catch (FileNotFoundException err) {
            err.printStackTrace();
            System.out.println();
            return false;
        }
        
        return true;
    }
    
    public boolean saveToFile(String filename) {
        try {
            File brands = new File(filename);
            FileWriter fw = new FileWriter(brands);
            
            for (Brand brand: brandList) {
                fw.write(brand.getBrandID() + ", " + brand.getBrandName() + ", " + brand.getSoundBrand() + ": " + brand.getPrice() + "\n");
            }
            
            fw.close();
            
        } catch (IOException err) {
            err.printStackTrace();
            System.out.println();
            return false;
            
        }
        
        return true;
    }
    
    public int searchID(String bID) {
        int n = brandList.size();
        
        for (int i = 0; i < n; i++) {
            if(brandList.get(i).getBrandID().equals(bID.toUpperCase())) return i;
        }
        
        return -1;
    }
    
    public Brand getBrand(int pos) {
        return brandList.get(pos);
    }
    
    public Brand getUserChoice() throws EmptyInputException {
        Menu menu = new Menu();
        return (Brand)menu.ref_getChoice(brandList);
    }
    
    public void addBrand() throws EmptyInputException, DuplicateInputException, InvalidInputException {
        String brandID, brandName, soundBrand;
        double price;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter brand ID: ");
        try {
            brandID = sc.nextLine().toUpperCase();
            if (searchID(brandID) != -1) throw new DuplicateInputException("Brand ID already existed.");
        } catch (DuplicateInputException err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        System.out.print("Enter brand name: ");
        try {
            brandName = sc.nextLine();
            if (brandName == null) throw new EmptyInputException("User have not entered a valid brand name.");
        } catch (EmptyInputException err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        System.out.print("Enter sound brand: ");
        try {
            soundBrand = sc.nextLine();
            if (soundBrand == null) throw new EmptyInputException("User have not entered a valid sound brand.");
        } catch (EmptyInputException err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        System.out.print("Enter price: ");
        try {
            price = Double.parseDouble(sc.nextLine());
            if (price <= 0) throw new InvalidInputException("User have not entered a valid price.");
        } catch (InvalidInputException err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        Brand brand = new Brand(brandID, brandName, soundBrand, price);
        brandList.add(brand);
        System.out.println("Brand added.\n");
        
        return;
        
    }
    
    public void updateBrand() {
        String brandID, brandName, soundBrand;
        int pos;
        double price;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter brand ID: ");
        try {
            brandID = sc.nextLine().toUpperCase();
            pos = searchID(brandID);
            if (pos == -1) throw new InvalidInputException("Could not find requested brand ID.");
        } catch (InvalidInputException err) {
            err.printStackTrace();
            System.out.println();
            System.out.println("Not found!");
            return;
        }
        
        System.out.print("Enter brand name: ");
        try {
            brandName = sc.nextLine();
            if (brandName == null) throw new EmptyInputException("User have not entered a valid brand name.");
        } catch (EmptyInputException err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        System.out.print("Enter sound brand: ");
        try {
            soundBrand = sc.nextLine();
            if (soundBrand == null) throw new EmptyInputException("User have not entered a valid sound brand.");
        } catch (EmptyInputException err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        System.out.print("Enter price: ");
        try {
            price = Double.parseDouble(sc.nextLine());
            if (price <= 0) throw new InvalidInputException("User have not entered a valid price.");
        } catch (InvalidInputException err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        brandList.get(pos).setBrandName(brandName);
        brandList.get(pos).setSoundBrand(soundBrand);
        brandList.get(pos).setPrice(price);
        
        System.out.println("Brand updated.");
        
        return;
        
    }
    
    public void listBrands() {
        for (Brand brand: brandList) {
            System.out.println(brand.getBrandID() + ", " + brand.getBrandName() + ", " + brand.getSoundBrand() + ": " + brand.getPrice());
        }
        
        System.out.println();
    }    
    
}
