public class Car {
    // attribs
    private String maker;
    private int rate;


    // constructors
    public Car() {};
    public Car(String maker, int rate) {
        this.maker = maker;
        this.rate = rate;
    }


    // setters
    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


    // getters
    public String getMaker() {
        return maker;
    }

    public int getRate() {
        return rate;
    }

}
