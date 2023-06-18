package DTO;

public class BeeColony extends Colony implements Role {
    private String type;

    public BeeColony() {
    }

    public BeeColony(int size, String type, String place) {
        super(size, place);
        this.type = type;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    @Override
    public String toString() {
        return "the colony’s type is " + type + ", size is about " + size + ", and the place is " + place;
    }
}
