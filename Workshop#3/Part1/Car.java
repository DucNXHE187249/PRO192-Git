public class Car {
    String Colour= "";
    int EnginePower = 0;
    boolean Convertible;
    boolean ParkingBrake;

    Car();
    Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake);

    public void setColour(String Colour) {this.Colour = Colour;};
    public void setConvertible(boolean Convertible) {this.Convertible = Convertible;};
    public void setEnginePower(int EnginePower) {this.EnginePower = EnginePower;};
    public void setParkingBrake(boolean ParkingBrake) {this.ParkingBrake = ParkingBrake;};

    public String getColour() {return Colour;}
    public boolean getConvertible() {return Convertible;}
    public int getEnginePower() {return EnginePower;}
    public boolean getParkingBrake() {return ParkingBrake;}
}