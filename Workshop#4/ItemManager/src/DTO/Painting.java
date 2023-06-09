package DTO;
import java.util.Scanner;
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    
    public int getWidth(){
        return width;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public boolean isWatercolour(){
        return isWatercolour;
    }
    
    public boolean isFramed(){
        return isFramed;
    }
    
    public void setFramed(boolean framed){
        isFramed = framed;
    }
    
    public void inputPainting(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextInt();
        System.out.print("Enter width: ");
        width = sc.nextInt();
        System.out.print("Is is watercolour? (true/false): ");
        isWatercolour = sc.nextBoolean();
        System.out.print("Is it framed? (true/false): ");
        isFramed = sc.nextBoolean();
    }
    
    public void outputPainting(){
        output();
        System.out.println("Height: " +height);
        System.out.println("Width: " +width);
        System.out.println("Watercolour: " +isWatercolour);
        System.out.println("Framed: " +isFramed);
    }
}
