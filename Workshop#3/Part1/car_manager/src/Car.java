public class Car {
    String Colour= "";
    int EnginePower = 0;
    boolean Convertible;
    boolean ParkingBrake;

    //Constructors
    Car(){}
    Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake){}

    //Getters
    public void setColour(String Colour) {this.Colour = Colour;};
    public void setConvertible(boolean Convertible) {this.Convertible = Convertible;};
    public void setEnginePower(int EnginePower) {this.EnginePower = EnginePower;};
    public void setParkingBrake(boolean ParkingBrake) {this.ParkingBrake = ParkingBrake;};

    //Setters
    public String getColour() {return Colour;}
    public boolean getConvertible() {return Convertible;}
    public int getEnginePower() {return EnginePower;}
    public boolean getParkingBrake() {return ParkingBrake;}

    //Other logic methods
    public void pressStartButton(){
        System.out.println("You've pressed the Start button !");
    }

    public void pressAcceleratorButton(){
        System.out.println("You've pressed the Accelerator button !");
    }

    public void output(){
        System.out.println(getColour());
        System.out.println(getEnginePower());
        System.out.println(getConvertible());
        System.out.println(getParkingBrake());
    }
}