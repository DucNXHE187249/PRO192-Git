import java.util.*;
import java.io.*;
public class CarManager {
    public static void main (String[] args) throws IOException, Exception{
        ArrayList options = new ArrayList(Arrays.asList("List all brands","Add a new brand","Search a brand based on its ID","Update a brand", "Save all brands to the file, named brands.txt","List all cars in ascending order of brand names","List cars based on a part of an input brand name","Add a car","Remove a car based on its ID","Update a car based on its ID","Save cars to file, named cars.txt"));
        String brandsFile = "D:\\FPT\\PRO192\\Car BMW\\brands.txt";
        String carsFile = "D:\\FPT\\PRO192\\Car BMW\\cars.txt";
        
        BrandList brandList = new BrandList();
        brandList.loadFromFile(brandsFile);
        CarList carList = new CarList(brandList);
        carList.loadFromFile(carsFile);
        
        Menu mnu = new Menu();
        Scanner sc = new Scanner(System.in);
        
        int choice;
        do {
            choice = mnu.int_getChoice(options);
            switch(choice){
                case 1:
                    brandList.listBrands();
                    break;
                case 2:
                    brandList.addBrand();
                    break;     
                case 3:
                    System.out.print("Enter BrandID: ");
                    String brandID = sc.nextLine();
                    if (brandList.searchID(brandID) != -1){
                        System.out.println(brandList.getBrand(brandList.searchID(brandID)).getBrandID() + ", " + brandList.getBrand(brandList.searchID(brandID)).getBrandName() + ", " + brandList.getBrand(brandList.searchID(brandID)).getSoundBrand() + ": " + brandList.getBrand(brandList.searchID(brandID)).getPrice());
                    } else System.out.println("BrandID not found");
                    break;
                case 4:
                    brandList.updateBrand();
                    break;
                case 5:
                     if (brandList.saveToFile(brandsFile)) System.out.println("Brands saved to file");
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
        } while (choice > 0 && choice < 12);
    }
}
