import java.util.ArrayList;
import Com.*;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CarManager {
    public static void main(String args[]) throws FileNotFoundException, EmptyInputException, DuplicateInputException, InvalidInputException {
        String brandsFile = "D:\\FPT University\\2023, Summer\\PRO192\\summer_as\\CarPrj\\Brands.txt";
        String carsFile = "D:\\FPT University\\2023, Summer\\PRO192\\summer_as\\CarPrj\\Cars.txt";
        
        BrandList brandList = new BrandList();
        brandList.loadFromFile(brandsFile);
        
        CarList carList = new CarList(brandList);
        carList.loadFromFile(carsFile);
        
        Menu menu = new Menu();
        
        Scanner sc = new Scanner(System.in);
        
        int choice;
        ArrayList options = new ArrayList(Arrays.asList("List all brands", "Add a new brand", "Search a brand based on its ID", "Update a brand", "Save brands to file", "List all car in ascending order of brand names", "List car based on a part of an input brand name", "Add a car", "Remove a car", "Update a car based on its ID", "Save cars to file"));
        
        do {
            choice = menu.int_getChoice(options);
            switch (choice) {
                case 1: 
                    brandList.listBrands();
                    break;
                    
                case 2:
                    brandList.addBrand();
                    break;
                    
                case 3:
                    System.out.print("Enter brand ID: ");
                    String brandID = sc.nextLine();
                    if (brandList.searchID(brandID) != -1) {
                        System.out.println(brandList.getBrand(brandList.searchID(brandID)).getBrandID() + ", " + brandList.getBrand(brandList.searchID(brandID)).getBrandName() + ", " + brandList.getBrand(brandList.searchID(brandID)).getSoundBrand() + ": " + brandList.getBrand(brandList.searchID(brandID)).getPrice() + "\n");
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                    
                case 4:
                    brandList.updateBrand();
                    break;
                
                case 5:
                    if (brandList.saveToFile(brandsFile)) System.out.println("Brands saved to file.\n");
                    break;
                 
                case 6:
                    carList.listCars();
                    break;
                
                case 7:
                    carList.printBasedBrandName();
                    break;
                    
                case 8:
                    carList.addCar();
                    break;
                    
                case 9:
                    carList.removeCar();
                    break;
                
                case 10: 
                    carList.updateCars();
                    break;
                    
                case 11:
                    if (carList.saveToFile(carsFile)) System.out.println("Cars saved to file.\n");
                    break;
                    
                default:
                    return;
                    
            }
            
        } while (choice > 0 && choice <= options.size());
    }
}
