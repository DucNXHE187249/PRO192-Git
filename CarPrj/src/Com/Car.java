package Com;

import java.lang.Comparable;

public class Car implements Comparable<Car> {
    // attribs
    private String carID;
    private Brand brand;
    private String color;
    private String frameID;
    private String engineID;
    
    
    // constructors
    public Car() {}

    public Car(String carID, Brand brand, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }
    
    
    // setters
    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }
    
    
    // getters
    public String getCarID() {
        return carID;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getFrameID() {
        return frameID;
    }

    public String getEngineID() {
        return engineID;
    }

    
    // others
    @Override
    public int compareTo(Car car) {
        int d = this.brand.getBrandName().compareTo(car.brand.getBrandName());
        
        if (d != 0) {
            return d;
        } else {
            return this.carID.compareTo(car.carID);
        }
        
    }
    
    public String toString() {
        return carID + ", " + brand.getBrandID() + ", " + color + ", " + frameID + ", " + engineID;
    }
    
    public String screenString() {
        return brand.getBrandID() + ", " + brand.getBrandName() + ", " + brand.getSoundBrand() + ": " + brand.getPrice() + "\n" + carID + ", " + color + ", " + frameID + ", " + engineID;
    }
    
}
