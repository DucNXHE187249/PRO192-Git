package Com;

public class Brand {
    // attribs
    private String brandID;
    private String brandName;
    private String soundBrand;
    private double price;
    
    
    // constructors
    public Brand() {}
    
    public Brand(String brandID, String brandName, String soundBrand, double price) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.soundBrand = soundBrand;
        this.price = price;
    }
    
    
    // setters
    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    public void setSoundBrand(String soundBrand) {
        this.soundBrand = soundBrand;
    }
    
    public void setPrice (double price) {
        this.price = price;
    }
    
    
    // getters
    public String getBrandID() {
        return brandID;
    }
    
    public String getBrandName() {
        return brandName;
    }
    
    public String getSoundBrand() {
        return soundBrand;
    }
    
    public double getPrice() {
        return price;
    }
    
    
    // others
    @Override
    public String toString() {
        return brandID + ", " + brandName + ", " + soundBrand + ": " + price;
    }
    
}
