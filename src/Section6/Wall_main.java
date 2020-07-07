package Section6;

public class Wall_main {
    public static void main(String[] args) {
        Wall_class wall1 = new Wall_class(5,4);
        System.out.println("area = " + wall1.getArea());

        wall1.setHeight(-1.5);
        System.out.println("width = " + wall1.getWidth());
        System.out.println("height = " + wall1.getHeight());
        System.out.println("area = " + wall1.getArea());
    }
}
