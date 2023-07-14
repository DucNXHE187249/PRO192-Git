import java.lang.reflect.Field;

public class SpecCar extends Car {
    // attribs
    private int type;

    // constructors
    public SpecCar() {
        super();
    }
    
    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    // setters
    public void setData() {
        super.setMaker("XZ" + super.getMaker());
        super.setPrice(super.getPrice() + 20);
    }

    // getters
    public int getValue() {
        if (type < 7) {return super.getPrice() + 10;} else {return super.getPrice()  + 15;}
    }

    @Override public String toString() {
        String result = super.getMaker() + ", " + String.valueOf(super.getPrice()) + ", " + String.valueOf(type);
        return result;
    }

}
