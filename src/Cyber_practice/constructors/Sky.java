package Cyber_practice.constructors;

public class Sky {

    String color;
    int visibleStars;

    public Sky(String color){
        this.color = color;
    }

    // Constructor
    public Sky(String color, int visibleStars) {
        this.color = color;
        this.visibleStars = visibleStars;
    }

    public Sky() {}

    // Constructor (constructor overloading)
    public void info () {
        System.out.println("Color: " + color);
        System.out.println("Number of visible stars: " + visibleStars);
    }



    public static void main(String[] args) {
        Sky refSky = new Sky("blue");
        refSky.info();

        Sky refSky1 = new Sky("dark blue", 345);
        //System.out.println(refSky1.color);
        //System.out.println(refSky1.visibleStars);

        refSky1.info();

        Sky s = new Sky();
        s.color = "green";
        s.visibleStars = 12;
        s.info();
    }



}
