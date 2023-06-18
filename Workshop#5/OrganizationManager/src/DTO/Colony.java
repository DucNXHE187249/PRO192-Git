package DTO;

public class Colony extends Organization {
    private String place;

    public Colony() {
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }

    @Override
    public void communicateByTool() {
        System.out.println("The colony communicates by sound");
    }

    public void grow() {
        System.out.println("An annual cycle of growth that begins in spring");
    }

    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "The colony size is " + size + ", the colony's place is " + place;
    }
}
