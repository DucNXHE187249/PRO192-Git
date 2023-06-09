package DTO;

import java.util.Scanner;

public class Vase extends Item{
    private int height;
    private String material;
    
    public Vase(){
    }
    public Vase(int value, String creator, int height, String material){
        super(value, creator);
        this.height = height;
        this.material = material;
    }
    
    public void outputVase(){
        super.output();
        System.out.println("Height: " +height);
        System.out.println("Material: " +material);
    }
    
    public void inputVase(){
        super.input();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter height: ");
        height = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter material: ");
        material = sc.nextLine();
    }
}
