package Cyber_practice.constructors;

public class Sky {

    public Sky(String color){
        this.color = color;
    }

    public Sky(String color, int visibleStars) {
        this.color = color;
        this.visibleStars = visibleStars;
    }

    public void info () {
        System.out.println("Color: " + color);
        System.out.println("Number of visible stars: " + visibleStars);
    }

    String color;
    int visibleStars;

    public static void main(String[] args) {
        Sky refSky = new Sky("blue");
        System.out.println(refSky.color);

        Sky refSky1 = new Sky("dark blue", 345);
        //System.out.println(refSky1.color);
        //System.out.println(refSky1.visibleStars);

        refSky1.info();
    }

}
