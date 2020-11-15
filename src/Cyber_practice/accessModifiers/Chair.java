package Cyber_practice.accessModifiers;

public class Chair {
    private int size;
    String model;

    public void setSize(int size){
        if (size > 0) {
            this.size = size;
        }
    }

    public int getSize(){
        if (model.equals("IKEA")) {
            return size;
        } else {
            System.err.println("Not an IKEA chair, cannot provide size");
            return -1;
        }
    }



    void info () {
        System.out.println("Model: " + model);
        System.out.println("Size: " + size);
    }
}
