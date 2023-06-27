public class Car {
    private String maker;
    private int rate;
    
    public Car(){
    }
    
    public Car (int rate, String maker){
        this.rate = rate;
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public int getRate() {
        return rate;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
}