import java.util.*;
import java.io.*;

public class CarList{
    BrandList brandList;
    final ArrayList<Car> carList = new ArrayList<Car>();
    Menu mnu = new Menu();
    
    public CarList(BrandList bList){
        this.brandList = bList;
    }
    
    public boolean loadFromFile(String filename) throws Exception{
        File brands = new File(filename);
        try {
            Scanner sc = new Scanner(brands);
            while (sc.hasNextLine()){
                String [] line = sc.nextLine().split(", ");
                Brand brand = brandList.getBrand(brandList.searchID(line[1]));
                Car car = new Car(line[0], brand, line [2], line [3], line [4]);
                carList.add(car);
            }
        } catch (Exception err){
            err.printStackTrace();
            System.out.println();
        }
        return true;
    }
    
    public boolean saveToFile(String filename) throws FileNotFoundException, IOException{
        File brands = new File(filename);
        FileWriter fw = new FileWriter(brands);
        try {
            for (Car car: carList){
                fw.write(car.getCarID() + ", " + car.getBrand().getBrandID() + ", " + car.getColor() + ", " + car.getFrameID() + ", " + car.getEngineID() + "\n");
            }
        } catch (FileNotFoundException err){
            err.printStackTrace();
            System.out.println();
        }
        return true;
    }
    
    public int searchID(String carID) {
        int n = carList.size();
        
        for (int i = 0; i < n; i++) {
            if(carList.get(i).getCarID().equals(carID.toUpperCase())) return i;
        }
        return -1;
    }
    
     public int searchFrame(String fID) {
        int n = carList.size();
        
        for (int i = 0; i < n; i++) {
            if(carList.get(i).getFrameID().equals(fID.toUpperCase())) return i;
        }
        
        return -1;
    }
     
     public int searchEngine(String eID) {
        int n = carList.size();
        
        for (int i = 0; i < n; i++) {
            if(carList.get(i).getEngineID().equals(eID.toUpperCase())) return i;
        }
        
        return -1;
    }
    public void addCar() {
        String carID, color, frameID, engineID;
        double price;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter car ID: ");
        try {
            carID = sc.nextLine().toUpperCase();
            if (searchID(carID) != -1) throw new Exception("Brand ID already existed.");
        } catch (Exception err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        System.out.println();
        
        System.out.print("Select a brand: \n");
        Brand brand = (Brand)mnu.ref_getChoice(brandList.brandList);
        
        System.out.print("Enter the color: ");
        try {
            color = sc.nextLine();
            if (color == null) throw new Exception("User have not entered a valid sound brand.");
        } catch (Exception err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        System.out.print("Enter the frame ID: ");
        try {
            frameID = sc.nextLine().toUpperCase();
            if (searchFrame(frameID) != -1) throw new Exception("This frame ID already existed.");
            if (!frameID.matches("[F][0-9]{5}")) throw new Exception("This is not a valid frame ID.");
        } catch (Exception err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        System.out.print("Enter the engine ID: ");
        try {
            engineID = sc.nextLine().toUpperCase();
            if (searchEngine(engineID) != -1) throw new Exception("This engine ID already existed.");
            if (!engineID.matches("[E][0-9]{5}")) throw new Exception("This is not a valid engine ID.");
        } catch (Exception err) {
            err.printStackTrace();
            System.out.println();
            return;
        }
        
        Car car = new Car(carID, brand, color, frameID, engineID);
        carList.add(car);
        System.out.println("Car added.\n");
        
        return;
    }
    public void printBasedBrandName() {
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the partial brand name: ");
        String brandNameFrag = sc.nextLine();
        System.out.println();
        
        for (Car car: carList) {
            if (car.getBrand().getBrandName().contains(brandNameFrag)) {
                System.out.println(car.screenString());
                count++;
            }
        }
        System.out.println();
        
        if (count == 0) {
            System.out.println("No car is detected!");
            System.out.println();
        }   
    }
    public boolean removeCar() {
        String removedID;
        int pos;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter car ID to be removed: ");
        removedID = sc.nextLine().toUpperCase();
        
        pos = searchID(removedID);
        
        if (pos == -1) {
            System.out.println("Not found!");
            System.out.println();
            return false;
        } else {
            carList.remove(pos);
            System.out.println("Car removed.\n");
            return true;
        }        
    }
    public boolean updateCars() {
        String carID, color, frameID, engineID;
        double price;
        int pos;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter car ID: ");
        try {
            carID = sc.nextLine().toUpperCase();
            pos = searchID(carID);
            if (pos == -1) throw new Exception("Cannot find requested car ID.");
        } catch (Exception err) {
            err.printStackTrace();
            System.out.println();
            return false;
        }
        
        System.out.print("Select a brand: ");
        Brand brand = (Brand)mnu.ref_getChoice(brandList.brandList);
        
        System.out.print("Enter the new color: ");
        try {
            color = sc.nextLine();
            if (color == null) throw new Exception("User have not entered a valid sound brand.");
        } catch (Exception err) {
            err.printStackTrace();
            System.out.println();
            return false;
        }
        
        System.out.print("Enter the new frame ID: ");
        try {
            frameID = sc.nextLine().toUpperCase();
            if (searchFrame(frameID) != -1) throw new Exception("This frame ID already existed.");
            if (!frameID.matches("[F][0-9]{5}")) throw new Exception("This is not a valid frame ID.");
        } catch (Exception err) {
            err.printStackTrace();
            System.out.println();
            return false;
        }
        
        System.out.print("Enter the new engine ID: ");
        try {
            engineID = sc.nextLine().toUpperCase();
            if (searchEngine(engineID) != -1) throw new Exception("This engine ID already existed.");
            if (!engineID.matches("[E][0-9]{5}")) throw new Exception("This is not a valid engine ID.");
        } catch (Exception err) {
            err.printStackTrace();
            System.out.println();
            return false;
        }
        
        carList.get(pos).setBrand(brand);
        carList.get(pos).setColor(color);
        carList.get(pos).setFrameID(frameID);
        carList.get(pos).setEngineID(engineID);
        
        System.out.println("Car updated.\n");        
        return true;        
    }
    public void listCars() {      
        for (Car car: carList) {
            System.out.println(car.screenString());
        }
        System.out.println();
    }
}