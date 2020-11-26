package AlexLee_youtube.polymorphism;

class Shape {
    public void draw (){
        System.out.println("Shape class, draw method");
    }
}

class Circle  extends Shape {
    public void draw (){
        System.out.println("Circle class, draw method");
    }
}

class Triangle extends Shape {
    public void draw (){
        System.out.println("Triangle class, draw method");
    }
}

public class Polymorphism_example2 {
    public static void main(String[] args) {

        Shape a = new Circle();
        a.draw();

        Shape b = new Triangle();
        b.draw();

    }
}
