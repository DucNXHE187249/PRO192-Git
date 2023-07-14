public class Car {
    // attribs
    private String maker;
    private int price;

    // constructors
    public Car() {}
    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;    
    }

    // setters
    public void setMaker(String maker) {this.maker = maker;}
    public void setPrice(int price) {this.price = price;}
    

    // getters
    public String getMaker() {return maker;}
    public int getPrice() {return price;}

    // others
    public String toString() {
        String result = maker + ", " + String.valueOf(price);
        return result;
    }
}

