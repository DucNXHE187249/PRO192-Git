public class SpecCar extends Car{
    private int type;

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    public void setData(){
        setMaker("XZ" + getMaker());
        setPrice(getPrice() + 20);
    }
    
    public int setValue(){
         int x;
        if (type < 7){
            x = super.getPrice() + 10;
        }
        else x = super.getPrice() + 15;
        return x;
    }
    
    
    @Override
    public String toString(){
        return "The maker is " + super.getMaker() + ", the price is " + super.getPrice() + " and the type is " + type;
    }
}
