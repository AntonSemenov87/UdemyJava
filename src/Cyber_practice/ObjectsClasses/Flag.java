package Cyber_practice.ObjectsClasses;

public class Flag {
    String country;
    int size;
    String color;
    String material;

    public void info(){
        System.out.println("Country: " + country);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }

    public void flap(){
        System.out.println("Flag is flapping");
    }

    public void upgrade (int size, String material) {
        this.size = size;
        this.material = material;
    }
}
