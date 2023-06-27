public class Car {
    private String maker;
    private int price;

    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String toString(){
        return "The maker is " + maker + " and the price is " + price;
    }
}
