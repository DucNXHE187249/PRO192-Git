public class CarList extends Car{
    public CarList(String carId, Brand brand, String color, String frameId, String engineId) {
        super(carId, brand, color, frameId, engineId);
    }
    
    public boolean loadFromFile(String f1){
        return false;
    }
    
    public boolean saveToFile(String f2){
        return false;
    }
    
    public int searchId(String Id){
        return 1;
    }
    
    public int searchFrame(String fId){
        return 1;
    }
    
    public int searchEngine(String eId){
        return 1;
    }
    
    public void addCar(){}
    
    public void printBasedBrandName(){}
    
    public boolean removeCar(){
        return false;
    }
    
    public boolean updateCar(){
        return false;
    }
    
    public void listCars(){}
}
